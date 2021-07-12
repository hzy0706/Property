package com.trkj.property.vo.form;

import java.util.Date;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TMerchantQueryForm implements Serializable {
    private static final long serialVersionUID = -17034901203322436L;

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
