package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "countryId")
    private Country countryId;
}
