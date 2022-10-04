package com.hw4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "airplane")
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
