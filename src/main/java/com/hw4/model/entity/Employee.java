package com.hw4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "employee")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee implements Serializable {

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

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private Set<EmployeeDepartments> employeeDepartments;

    public String toString() {
        return "Employee{" +
                "post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
