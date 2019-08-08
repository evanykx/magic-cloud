package cn.ice.lab.entity;

import cn.ice.lab.constant.DeletedFlag;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

public class User {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private DeletedFlag deleted;

    @Getter
    @Setter
    private String creator;

    @Getter
    @Setter
    private Date created;

    @Getter
    @Setter
    private String updater;

    @Getter
    @Setter
    private Date updated;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<User {id= ").append(this.id).append(", ");
        builder.append("username= ").append(this.username).append(", ");
        builder.append("age= ").append(this.age).append(", ");
        builder.append("password= ").append(this.password).append(", ");
        builder.append("deleted= ").append(this.deleted).append(", ");
        builder.append("creator= ").append(this.creator).append(", ");
        builder.append("created= ").append(this.created).append(", ");
        builder.append("updater= ").append(this.updater).append(", ");
        builder.append("updated= ").append(this.updated).append("}> ");
        return builder.toString();
    }
}
