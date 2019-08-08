package cn.ice.lab.constant;

import cn.ice.lab.constant.BaseEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public abstract class BaseEnumTypeHandler<E extends Enum<E> & BaseEnum> extends BaseTypeHandler<E> {

    private Class<E> type;

    private E[] enums;

    public BaseEnumTypeHandler() {
        // Ignore
    }

    public BaseEnumTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type of argument cannot be null!");
        }
        this.type = type;
        this.enums = type.getEnumConstants();
        if (this.enums == null) {
            throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter,
                                    JdbcType jdbcType) throws SQLException {

        if (jdbcType == null) {
            ps.setString(i, Objects.toString(parameter.getValue()));
        } else {
            ps.setObject(i, parameter.getValue(), jdbcType.TYPE_CODE);
        }
    }

    /**
     * Result mapping
     * @param rs
     * @param columnName
     * @return
     * @throws SQLException
     */
    @Override
    public E getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        String i = rs.getString(columnName);
        if (rs.wasNull()) {
            return null;
        } else {
            return locateEnumStatus(i);
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex)
            throws SQLException {
        String i = rs.getString(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            return locateEnumStatus(i);
        }
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        String i = cs.getString(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            return locateEnumStatus(i);
        }
    }

    private E locateEnumStatus(String value) {
        for (E e : enums) {
            if (Objects.toString(e.getValue()).equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Unknown enum type：" + value + ", check "
                + type.getSimpleName());
    }
}
