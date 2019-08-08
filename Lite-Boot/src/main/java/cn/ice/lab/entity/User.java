package cn.ice.lab.entity;

import cn.ice.lab.constant.DeletedFlag;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @Column
    @Getter
    @Setter
    private String id;

    @Column
    @Getter
    @Setter
    private String username;

    @Column
    @Getter
    @Setter
    private Integer age;

    @Column
    @Getter
    @Setter
    private String password;

    @Column
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private DeletedFlag deleted;

    @Column
    @Getter
    @Setter
    private String creator;

    @Column
    @Getter
    @Setter
    private Date created;

    @Column
    @Getter
    @Setter
    private String updater;

    @Column
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
