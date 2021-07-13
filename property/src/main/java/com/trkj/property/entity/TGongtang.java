package com.trkj.property.entity;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (TGongtang)实体类
 *
 * @author makejava
 * @since 2021-07-14 05:50:47
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TGongtang implements Serializable {
    private static final long serialVersionUID = 105056122255516477L;

    private Integer gId;

    private String gName;

    private Integer gChargecycle;

    private Double gSubtotal;

    private String chco;

    private String residenceName;

    private String found;
}
