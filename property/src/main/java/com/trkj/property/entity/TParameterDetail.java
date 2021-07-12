package com.trkj.property.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (TParameterDetail)实体类
 *
 * @author lukew
 * @since 2021-07-12 00:48:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TParameterDetail implements Serializable {
    private static final long serialVersionUID = -11386167865519356L;

    private Integer parDeId;

    private Integer parId;

    private Integer ctId;

    private Double parDeAssessment;

    private Date parDeBegin;

    private Date parDeEnd;

    private Date parDeDeadline;

    private Integer parDeState;




}
