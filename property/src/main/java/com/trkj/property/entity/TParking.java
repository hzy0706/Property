package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * t_parking
 * @author 
 */
@Data
public class TParking implements Serializable {
    private Integer parkingId;

    private Integer salecontractId;

    private Integer leasecontractId;
//楼盘id
    private Integer residenceId;

    private Integer pnumber;

    private Integer state;

    private String type;

    private Integer types;

    private Integer managemen;

    private BigDecimal presale;

    private BigDecimal preprice;

    private String position;

    private BigDecimal area;

    private String remarks;

    //住宅表外键
    private TResidence tResidence;

    private static final long serialVersionUID = 1L;
}