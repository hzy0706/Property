package com.trkj.property.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * t_parkingSales
 * @author 
 */
@Data
public class TParkingsales implements Serializable {
    private Integer parkingsalesId;

    private Integer salecontractId;

    private BigDecimal price;

    private String license;

    private String parking;

    private Integer parkingId;

    private Integer ownerId;

//    车位信息外键
    private TParking tParking;
//    业主外键
    private TOwner tOwner;



    private static final long serialVersionUID = 1L;
}