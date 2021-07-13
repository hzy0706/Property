package com.trkj.property.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (TParameter)实体类
 *
 * @author lukew
 * @since 2021-07-11 21:43:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TParameter implements Serializable {
    private static final long serialVersionUID = -23693542413602189L;

    private Integer parId;

    private String parName;

    private String parCostname;

    private Date parCreatedate;

    private String parCreateName;

    private String parMark;

    private Integer houseId;

    private Date parDeBegin;

    private Date parDeEnd;

    private List<TParameterDetail> tParameterDetail;


}
