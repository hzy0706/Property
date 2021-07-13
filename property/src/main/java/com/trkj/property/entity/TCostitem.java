package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * t_costitem
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TCostitem implements Serializable {
    private Integer ctId;

    private Integer residenceId;

    private String ctName;

    private Integer ctChargecycle;

    private Double ctSubtotal;

    private Integer overdue;

    private Double overduefine;

    private String ctRelation;

    private String chco;

    private String ifprice;

    private static final long serialVersionUID = 1L;
}