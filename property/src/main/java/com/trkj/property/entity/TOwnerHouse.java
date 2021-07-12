package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_owner_house
 * @author 
 */
@Data
public class TOwnerHouse implements Serializable {
    private Integer ohId;

    private Integer houseId;

    private Integer ownerId;

    private String houseNo;

    private Date decorateDate;

    private String ohRemark;

    private String houseName;

    private static final long serialVersionUID = 1L;
}