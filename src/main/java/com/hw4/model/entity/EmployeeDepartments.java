package com.hw4.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employeeDepartments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return "EmployeeDepartments{" +
                "employee=" + employee +
                ", departments=" + departments +
                '}';
    }
}
