package com.trkj.property.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 通过楼盘查询的所有台账列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParAndHouse {
    private String residence_name;
    private String par_name;
    private String par_costname;
    private Date par_createdate;
    private String par_mark;
}
