package com.trkj.property.entity.toll;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_parameter_detail
 * @author 
 */
@Data
public class ParameterDetail implements Serializable {
    private Integer parDeId;

    private Integer parId;

    private Integer ctId;

    private BigDecimal parDeAssessment;

    private Date parDeBegin;

    private Date parDeEnd;

    private Date parDeDeadline;

    private static final long serialVersionUID = 1L;
}