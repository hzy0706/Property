package com.trkj.property.entity.toll;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_bill
 * @author 
 */
@Data
public class BillEntity implements Serializable {
    private Integer billId;

    private Integer billDetailId;

    private Date billChargetime;

    private Integer billState;

    private BigDecimal billRealmoney;

    private Integer billType;

    private String billReceiptnumber;

    private String billInvoicenumber;

    private String billName;

    private String billCause;

    private String billModifier;

    private Date billModififerdate;

    private static final long serialVersionUID = 1L;
}