package com.hw4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "aircompany")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AirCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String aircompanyName;
}
