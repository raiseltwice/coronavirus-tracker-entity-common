package com.ct.entitycommon.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class CasesPerCountry {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private LocalDate date;
    private Integer numberOfCases;


    public CasesPerCountry() {
    }

    public CasesPerCountry(Country country, LocalDate date, Integer numberOfCases) {
        this.country = country;
        this.date = date;
        this.numberOfCases = numberOfCases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getNumberOfCases() {
        return numberOfCases;
    }

    public void setNumberOfCases(Integer numberOfCases) {
        this.numberOfCases = numberOfCases;
    }
}
