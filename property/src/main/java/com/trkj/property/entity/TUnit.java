package com.trkj.property.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_unit
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUnit implements Serializable {
    private Integer unitId;

    private Integer buildingId;

    private String unitName;

    private Integer startStorey;

    private Integer endStorey;

    private static final long serialVersionUID = 1L;
}