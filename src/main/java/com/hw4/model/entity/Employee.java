package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String post;

    @Column
    private int salary;

    @ManyToOne
    @JoinColumn(name = "passportId")
    private PassportData passport;

}
