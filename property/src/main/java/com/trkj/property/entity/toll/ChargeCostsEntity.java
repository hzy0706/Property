package com.trkj.property.entity.toll;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_charge_costs
 * @author 
 */
@Data
public class ChargeCostsEntity implements Serializable {
    private Integer chargeCostsId;

    private BigDecimal costMoney;

    private BigDecimal chargeCostAssessment;

    private BigDecimal overduefineMoney;

    private BigDecimal breakMoney;

    private Date chargeTime;

    private Date overdueTime;

    private Integer ischarge;

    private Date chargeCostsBegintime;

    private Date chargeCostsEndtime;

    private static final long serialVersionUID = 1L;
}