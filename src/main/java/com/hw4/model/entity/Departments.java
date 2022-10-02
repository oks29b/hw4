package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "departments")
@Data
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameDepartment;

    @ManyToOne
    @JoinColumn(name = "aircompanyId")
    private AirCompany airCompanyId;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employeeId;
}
