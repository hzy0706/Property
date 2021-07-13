package com.trkj.property.vo.form;

import java.util.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.property.entity.TMerchant;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TSellContractQueryForm implements Serializable {
    private static final long serialVersionUID = 911869748070586515L;

    private Integer sellId;

    private Integer stoId;

    private Integer merId;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date sellTime;

    private String sellContact;

    private Double sellAcre;

    private Double sellUnitprice;

    private Double sellPrice;

    private String sellPhone;

    private Integer sellAudit;

    private Integer sellPraudit;

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
