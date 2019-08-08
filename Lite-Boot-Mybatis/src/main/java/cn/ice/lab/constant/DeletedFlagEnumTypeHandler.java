package cn.ice.lab.constant;

import org.apache.ibatis.type.MappedTypes;


@MappedTypes(value =  {DeletedFlag.class})
public class DeletedFlagEnumTypeHandler<E extends  Enum<E> & BaseEnum> extends BaseEnumTypeHandler<E> {
    public DeletedFlagEnumTypeHandler(Class<E> type) {
        super(type);
    }
}
