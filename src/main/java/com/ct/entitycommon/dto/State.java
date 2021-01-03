package com.ct.entitycommon.dto;

import lombok.Data;

import java.util.List;

@Data
public class State {

    private String stateName;
    private Double latitude;
    private Double longitude;
    private List<StateCasesPerDate> stateCasesPerDate;
}
