package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "aircompany")
@Data
public class AirCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameCompany;
}
