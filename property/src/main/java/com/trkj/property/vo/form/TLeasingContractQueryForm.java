package com.trkj.property.vo.form;

import java.util.Date;
import java.io.Serializable;

import com.trkj.property.entity.TMerchant;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TLeasingContractQueryForm implements Serializable {
    private static final long serialVersionUID = 830771722957914774L;

    private Integer leaseId;

    private Integer merId;

    private Integer stoId;

    private Date leaseBegtime;

    private Date leaseEndtime;

    private Date leaseDate;

    private String leaseContacts;

    private String leasePhone;

    private Integer leaseChangemode;

    private Integer leaseTenterm;

    private Double leaseAcre;

    private Double leaseUnitprice;

    private Double leasePrice;

    private Integer leaseAudit;

    private Integer leasePraudit;

    private Double leaseProfee;

    private TMerchant tMerchant;

    private Integer pageNum;    //当前页
    private Integer pageSize;   //页大小

    public Integer getPageNum() {
        if (pageNum == null)
            return 1;
        return pageNum;
    }

    public Integer getPageSize() {
        if (pageSize == null)
            return 0;
        return pageSize;
    }
}
