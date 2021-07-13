package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_saleContract
 * @author 
 */
@Data
public class TSalecontract implements Serializable {
    private Integer salecontractId;

    private Integer parkingsalesId;

    private Integer parkingId;

    private Integer ownerId;

    private String contractId;

    private Date signingdate;

    private String remarks;

    private Integer state;

    private static final long serialVersionUID = 1L;
}