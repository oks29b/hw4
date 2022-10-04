package com.hw4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int cost;

    @ManyToOne
    @JoinColumn(name = "passportId")
    private PassportData passportData;

    @ManyToOne
    @JoinColumn(name = "cityArrivalId")
    private City cityArrival;

    @ManyToOne
    @JoinColumn(name = "cityDepartureId")
    private City cityDeparture;

    @ManyToOne
    @JoinColumn(name = "routeId")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "airplaneId")
    private Airplane airplane;

}
