package com.hw4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "departments")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Departments implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameDepartment;

    @ManyToOne
    @JoinColumn(name = "aircompanyId")
    private AirCompany airCompanyId;

//    @OneToMany(mappedBy = "departments", fetch = FetchType.EAGER)
//    private Set<EmployeeDepartments> employeeDept;
}
