package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "passportData")
@Data
public class PassportData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int number;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
}
