package com.trkj.property.entity.toll;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_parameter
 * @author 
 */
@Data
public class ParameterEntity implements Serializable {
    private Integer parId;

    private Integer parDeId;

    private Integer buildingId;

    private String parName;

    private String parCostname;

    private Date parCreatedate;

    private String parCreateName;

    private String parMark;

    private static final long serialVersionUID = 1L;
}