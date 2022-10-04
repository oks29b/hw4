package com.hw4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "passportData")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PassportData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int number;

    @ManyToOne
    @JoinColumn(name = "usersId")
    private Users users;

    public String toString() {
        return "PassportData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }
}
