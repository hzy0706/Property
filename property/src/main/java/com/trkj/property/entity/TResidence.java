package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

/**
 * t_residence
 * @author 
 */
@Data
public class TResidence implements Serializable {
    private Integer residenceId;

    private String residenceName;

    private BigDecimal greenArea;

    private BigDecimal floorArea;

    private String address;

    private BigDecimal coveredArea;

    private BigDecimal roadArea;

    private String taskName;

    private String developer;

    private static final long serialVersionUID = 1L;
    private List<TCostitem> tCostitemList;
}