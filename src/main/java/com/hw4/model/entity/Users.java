package com.hw4.model.entity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String login;

    @Column
    private String password;

//    @OneToMany(mappedBy = "users")
//    private Set<RolesUsers> roles;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "rolesUsers",
            joinColumns = {@JoinColumn (name = "usersId")},
            inverseJoinColumns = {@JoinColumn(name = "roleId")}
    )
    private Set<Roles> roles;

    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}