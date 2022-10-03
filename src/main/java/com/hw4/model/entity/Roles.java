package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nameRole")
    @Enumerated(EnumType.STRING)
    private Role roles;
}
