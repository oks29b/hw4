package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rolesUsers")
@Data
public class RolesUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    private Roles roles;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "usersId")
    private Users users;
}
