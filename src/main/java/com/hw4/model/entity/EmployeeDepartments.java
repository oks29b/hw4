package com.hw4.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employeeDepartments")
@Data
public class EmployeeDepartments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "departmentsId")
    private Departments departments;
}
