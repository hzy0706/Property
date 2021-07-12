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
public class TShopstoreQueryForm implements Serializable {
    private static final long serialVersionUID = 213451356305057301L;

    private Integer stoId;

    private Integer sellId;

    private Integer leaseId;

    private Integer merId;

    private String stoName;

    private Double stoArea;

    private Double stoUsarea;

    private String stoFunction;

    private String stoSpec;

    private String stoAspect;

    private String stoFinish;

    private String stoType;

    private Integer stoAudit;

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
