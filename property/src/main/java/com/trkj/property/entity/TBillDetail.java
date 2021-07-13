package com.trkj.property.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TBillDetail)实体类
 *
 * @author lukew
 * @since 2021-07-13 01:43:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TBillDetail implements Serializable {
    private static final long serialVersionUID = -28420228462652880L;

    private Integer billDetailId;
    //多对一 房间
    private THouse house;

    private Integer billId;
    //多对一 业主
    private TOwner tOwner;

    private String billReceiptnumber;

    private String billInvoicenumber;

    private Integer billType;

    private Double billDetailReceivable;

    private Double billRealmoney;

    private String billDetailPayee;

    private String billDetailMark;

    private Integer billArrearage;

    private Integer billSelectornum;



}
