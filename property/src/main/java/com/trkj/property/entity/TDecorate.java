package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_decorate
 * @author 
 */
@Data
public class TDecorate implements Serializable {
    private Integer decorateId;

    private Integer houseId;

    private String decorateType;

    private String applyName;

    private String decoratePhone;

    private String createName;

    private Date createDate;

    private Integer decorateState;

    private String decorateContent;

    private BigDecimal decorateBail;

    private String approvalSuggest;

    private String approvalName;

    private Date approvalDate;

    private String buildUnit;

    private String buildName;

    private String buildPhone;

    private Date buildStartDate;

    private Date buildEndDate;

    private String checkName;

    private Date checkDate;

    private String checkSuggest;

    private BigDecimal penaltyMoney;

    private String cancelName;

    private Date cancelDate;

    private String decorateRemark;

    private String houseName;

    private Date applyDate;

    private static final long serialVersionUID = 1L;
}