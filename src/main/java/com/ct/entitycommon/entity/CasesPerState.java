package com.ct.entitycommon.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class CasesPerState {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    private LocalDate date;

    private Integer numberOfCases;


    public CasesPerState() {
    }

    public CasesPerState(State state, LocalDate date, Integer numberOfCases) {
        this.state = state;
        this.date = date;
        this.numberOfCases = numberOfCases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
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
