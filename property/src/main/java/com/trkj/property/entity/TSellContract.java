package com.trkj.property.entity;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (TSellContract)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:15:45
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TSellContract implements Serializable {
    private static final long serialVersionUID = -10574448460994718L;

    private Integer sellId;

    private Integer stoId;

    private Integer merId;

    private Date sellTime;

    private String sellContact;

    private Double sellAcre;

    private Double sellUnitprice;

    private Double sellPrice;

    private String sellPhone;

    private Integer sellAudit;

    private Integer sellPraudit;

    private Double leaseProfee;
}
