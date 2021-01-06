package com.ct.entitycommon.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CountryCasesPerDate {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private LocalDate date;
    private Integer numberOfCases;

    public CountryCasesPerDate(Country country, LocalDate date, Integer numberOfCases) {
        this.country = country;
        this.date = date;
        this.numberOfCases = numberOfCases;
    }
}
