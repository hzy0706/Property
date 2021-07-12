package com.trkj.property.entity;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * (TMerchant)实体类
 *
 * @author makejava
 * @since 2021-07-12 14:55:15
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TMerchant implements Serializable {
    private static final long serialVersionUID = -40334913318323394L;

    private Integer merId;

    private String merName;

    private String merType;

    private String merRight;

    private String merContacts;

    private String merPhone;

    private String merAddress;

    private String merCardtype;

    private String merCard;

    private String merMain;

    private Integer merState;

    private String merMarket;

    private String merPrictrue;

    private Date merDate;
}
