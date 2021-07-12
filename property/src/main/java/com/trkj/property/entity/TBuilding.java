package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_building
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TBuilding implements Serializable {
    private Integer buildingId;

    private Integer residenceId;

    private String buildingName;

    private BigDecimal coveredArea;

    private BigDecimal useArea;

    private String buildFunction;

    private String structureType;

    private static final long serialVersionUID = 1L;
}