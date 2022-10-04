package com.hw4.model.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "route")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Timestamp arrivalTime ;

    @Column
    private Timestamp departureTime ;

    @ManyToMany(mappedBy = "routeSet")
    Set<City> citySet;

    public String toString() {
        return "Route{" +
                "arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                '}';
    }
}
