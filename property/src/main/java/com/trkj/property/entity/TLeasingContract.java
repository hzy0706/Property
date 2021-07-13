package com.trkj.property.entity;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (TLeasingContract)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:14:44
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TLeasingContract implements Serializable {
    private static final long serialVersionUID = -38193982195235490L;

    private Integer leaseId;

    private Integer merId;

    private Integer stoId;

    private Date leaseBegtime;

    private Date leaseEndtime;

    private Date leaseDate;

    private String leaseContacts;

    private String leasePhone;

    private Integer leaseChangemode;

    private Integer leaseTenterm;

    private Double leaseAcre;

    private Double leaseUnitprice;

    private Double leasePrice;

    private Integer leaseAudit;

    private Integer leasePraudit;

    private Double leaseProfee;

    private TMerchant tMerchant;
}
