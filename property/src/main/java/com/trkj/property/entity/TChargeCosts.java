package com.trkj.property.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (TChargeCosts)实体类
 *
 * @author lukew
 * @since 2021-07-12 20:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TChargeCosts implements Serializable {
    private static final long serialVersionUID = -70363825260633804L;

    private Integer chargeCostsId;

    private Double costMoney;

    private Double chargeCostAssessment;

    private Double overduefineMoney;

    private Double breakMoney;

    private Date chargeTime;

    private Date overdueTime;

    private Integer hasCharge;

    private Date chargeCostsBegintime;

    private Date chargeCostsEndtime;

    private String ctName;

    private Integer houseId;


}
