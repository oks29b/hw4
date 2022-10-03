package com.hw4.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "roles")
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nameRole")
    @Enumerated(EnumType.STRING)
    private Role roles;

    @ManyToMany(mappedBy = "roles")
    private Set<Users> users;

    public String toString() {
        return "Roles{" + roles +
                    '}';
    }
}
