package com.trkj.property.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * author:wjh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetParsVO {
    private String resName;
    private String buildName;
    private String unitName;
    private String houseName;
    private String ownerName;
    private String parCostName;
    private Date createTime;
    private String parCreateName;
    private String parMark;
    private Date beginDate;
    private Date endDate;
    private Double parDeAssessment;
    private Integer par_de_state;
}
