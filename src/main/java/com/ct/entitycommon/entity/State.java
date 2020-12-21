package com.ct.entitycommon.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class State {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;
    private String stateName;
    private Double latitude;
    private Double longitude;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "state")
    private Set<StateCasesPerDate> stateCasesPerDate;


    public State() {
    }

    public State(String stateName, Double latitude, Double longitude, Country country) {
        this.stateName = stateName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<StateCasesPerDate> getCasesPerState() {
        return stateCasesPerDate;
    }

    public void setCasesPerState(Set<StateCasesPerDate> stateCasesPerDate) {
        this.stateCasesPerDate = stateCasesPerDate;
    }
}
