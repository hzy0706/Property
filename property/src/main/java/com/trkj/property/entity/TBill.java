package com.trkj.property.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (TBill)实体类
 *
 * @author lukew
 * @since 2021-07-13 02:01:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TBill implements Serializable {
    private static final long serialVersionUID = 991193723432552054L;

    private Integer billId;

    private Integer billDetailId;

    private Date billChargetime;

    private Integer billState;

    private Double billRealmoney;

    private Integer billType;

    private String billReceiptnumber;

    private String billInvoicenumber;

    private String billName;

    private String billCause;

    private String billModifier;

    private Date billModififerdate;


}
