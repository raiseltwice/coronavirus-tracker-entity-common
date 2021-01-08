package com.ct.entitycommon.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Country {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;
    private String countryName;
    private Double latitude;
    private Double longitude;

    public Country(String countryName, Double latitude, Double longitude) {
        this.countryName = countryName;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
