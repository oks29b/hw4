package com.hw4.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "aircompany")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AirCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String aircompanyName;

    @Override
    public String toString() {
        return "AirCompany{" +
                "aircompanyName='" + aircompanyName + '\'' +
                '}';
    }
}
