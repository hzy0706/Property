package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_maintain
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMaintain implements Serializable {
    private Integer maintainId;

    private Integer houseId;

    private String houseName;

    private String applyName;

    private String maintainPhone;

    private String createName;

    private Date createDate;

    private Integer maintainState;

    private String maintainContent;

    private BigDecimal maintainBail;

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

    private String maintainRemark;

    private Date applyDate;

    private static final long serialVersionUID = 1L;
}