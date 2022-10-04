package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameCountry;
}
