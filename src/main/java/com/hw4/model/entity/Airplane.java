package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "airplane")
@Data
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String planeName;

    @Column
    private int planeNumber;

    @ManyToOne
    @JoinColumn(name = "aircompanyId")
    private AirCompany airCompanyId;
}
