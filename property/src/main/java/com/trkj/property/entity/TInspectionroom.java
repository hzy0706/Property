package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_inspectionroom
 * @author 
 */
@Data
public class TInspectionroom implements Serializable {
    private Integer irId;

    private Integer houseId;

    private Date acceptanceDate;

    private Date confirmationDate;

    private String irType;

    private Integer isOk;

    private String irName;

    private String irOwnerSuggest;

    private String irPropertySuggest;

    private String irRemark;

    private String houseName;

    private static final long serialVersionUID = 1L;
}