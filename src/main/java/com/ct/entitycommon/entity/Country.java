package com.ct.entitycommon.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;
    private String countryName;
    private Double latitude;
    private Double longitude;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country")
    private Set<State> states;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country")
    private Set<CountryCasesPerDate> countryCasesPerDate;
}
