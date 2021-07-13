package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date createDate;

    private Integer maintainState;

    private String maintainContent;

    private BigDecimal maintainBail;

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

    private String maintainRemark;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date applyDate;
    private Integer rid;
    private Integer bid;
    private Integer uid;

    private static final long serialVersionUID = 1L;
}