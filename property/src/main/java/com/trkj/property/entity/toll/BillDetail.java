package com.trkj.property.entity.toll;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * t_bill_detail
 * @author 
 */
@Data
public class BillDetail implements Serializable {
    private Integer billDetailId;

    private Integer houseId;

    private Integer billId;

    private Integer ownerId;

    private String billReceiptnumber;

    private String billInvoicenumber;

    private Integer billType;

    private BigDecimal billDetailReceivable;

    private BigDecimal billRealmoney;

    private String billDetailPayee;

    private String billDetailMark;

    private Integer billArrearage;

    private Integer billSelectornum;

    private static final long serialVersionUID = 1L;
}