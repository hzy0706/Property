package com.trkj.property.entity;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (TShopstore)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:16:38
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TShopstore implements Serializable {
    private static final long serialVersionUID = 222728990890833664L;

    private Integer stoId;

    private Integer sellId;

    private Integer leaseId;

    private Integer merId;

    private String stoName;

    private Double stoArea;

    private Double stoUsarea;

    private String stoFunction;

    private String stoSpec;

    private String stoAspect;

    private String stoFinish;

    private String stoType;

    private Integer stoAudit;

    private TMerchant tMerchant;
}
