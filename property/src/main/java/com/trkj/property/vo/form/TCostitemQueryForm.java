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
public class TCostitemQueryForm implements Serializable {
    private static final long serialVersionUID = -61949355174436553L;

    private Integer ctId;

    private Integer residenceId;

    private String ctName;

    private Integer ctChargecycle;

    private Double ctSubtotal;

    private Integer overdue;

    private String overduefine;
    /**
     * 关联费项
     */
    private String ctRelation;

    private String chco;

    private String ifprice;

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
