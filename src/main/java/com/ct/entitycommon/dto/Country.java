package com.ct.entitycommon.dto;

import lombok.Data;

import java.util.List;

@Data
public class Country {

    private String countryName;
    private Double latitude;
    private Double longitude;
    private List<State> states;
    private List<CountryCasesPerDate> countryCasesPerDate;
}
