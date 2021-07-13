package com.trkj.property.vo.form;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TGongtangQueryForm implements Serializable {
    private static final long serialVersionUID = -63706471909596483L;

    private Integer gId;

    private String gName;

    private Integer gChargecycle;

    private Double gSubtotal;

    private String chco;

    private String residenceName;

    private String found;

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
