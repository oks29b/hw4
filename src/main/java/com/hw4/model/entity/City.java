package com.hw4.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nameCity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "countryId")
    private Country countryId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "routeCity",
            joinColumns = {@JoinColumn (name = "cityId")},
            inverseJoinColumns = {@JoinColumn(name = "routeId")}
    )
    private Set<Route> routeSet;

    public String toString() {
        return "City{" +
                "id=" + id +
                ", nameCity='" + nameCity + '\'' +
                ", country='" + countryId + '\'' +
                ", route=" + routeSet +
                '}';
    }
}
