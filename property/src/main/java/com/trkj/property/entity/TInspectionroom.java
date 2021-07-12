package com.trkj.property.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_inspectionroom
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TInspectionroom implements Serializable {
    private Integer irId;

    private String houseName;

    private Integer houseId;

    private Integer okcount;

    private Integer nocount;

    private static final long serialVersionUID = 1L;
}