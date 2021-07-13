package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_house
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class THouse implements Serializable {
    private Integer houseId;

    private Integer unitId;

    private BigDecimal coveredArea;

    private BigDecimal useArea;

    private Integer storey;

    private String orientations;

    private String houseType;

    private String decorate;

    private Integer houseState;

    private Integer useState;

    private String houseName;

    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date stayDate;

    private static final long serialVersionUID = 1L;
}