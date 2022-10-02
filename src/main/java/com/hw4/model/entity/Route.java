package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "route")
@Data
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String arrivalTime ;

    @Column
    private String departureTime ;


}
