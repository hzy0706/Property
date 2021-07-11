package com.trkj.property.entity.toll;

import java.io.Serializable;
import lombok.Data;

/**
 * t_detail_bills_costsitem
 * @author 
 */
@Data
public class DetailBillsCostsitemEntity implements Serializable {
    private Integer detailChargesId;

    private Integer billDetailId;

    private Integer chargeCostsId;

    private static final long serialVersionUID = 1L;
}