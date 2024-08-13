package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "world", name = "city")
@Data
@NoArgsConstructor
public class City {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "district")
    private String district;

    @Column(name = "population")
    private Integer population;
}
