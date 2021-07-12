package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_inspectionroominfo
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TInspectionroominfo implements Serializable {
    private Integer irinfoId;

    private Integer houseId;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date acceptanceDate;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date confirmationDate;

    private String irType;

    private Integer isOk;

    private String irName;

    private String irOwnerSuggest;

    private String irPropertySuggest;

    private String irRemark;

    private Integer irId;

    private Integer rid;
    private Integer bid;
    private Integer uid;

    private static final long serialVersionUID = 1L;
}