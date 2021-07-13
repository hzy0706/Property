package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_decorate
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TDecorate implements Serializable {
    private Integer decorateId;

    private Integer houseId;

    private String decorateType;

    private String applyName;

    private String decoratePhone;

    private String createName;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date createDate;

    private Integer decorateState;

    private String decorateContent;

    private BigDecimal decorateBail;

    private String approvalSuggest;

    private String approvalName;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date approvalDate;

    private String buildUnit;

    private String buildName;

    private String buildPhone;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date buildStartDate;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date buildEndDate;

    private String checkName;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date checkDate;

    private String checkSuggest;

    private BigDecimal penaltyMoney;

    private String cancelName;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date cancelDate;

    private String decorateRemark;

    private String houseName;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date applyDate;
    private Integer rid;
    private Integer bid;
    private Integer uid;

    private static final long serialVersionUID = 1L;
}