package com.hw4.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "departments")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Departments implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameDepartment;

    @ManyToOne
    @JoinColumn(name = "aircompanyId")
    private AirCompany airCompanyId;

    public String toString() {
        return "Departments{" +
                "nameDepartment='" + nameDepartment + '\'' +
                '}';
    }
}
