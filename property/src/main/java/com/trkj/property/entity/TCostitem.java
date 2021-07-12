package com.trkj.property.entity;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (TCostitem)实体类
 *
 * @author makejava
 * @since 2021-07-12 16:15:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TCostitem implements Serializable {
    private static final long serialVersionUID = 287157381051249414L;

    private Integer ctId;

    private Integer residenceId;

    private String ctName;

    private Integer ctChargecycle;

    private Double ctSubtotal;

    private Integer overdue;

    private String overduefine;
    /**
     * 关联费项
     */
    private String ctRelation;

    private String chco;

    private String ifprice;

    private String residenceName;

    private String found;
}
