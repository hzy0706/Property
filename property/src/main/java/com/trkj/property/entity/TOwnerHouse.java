package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_owner_house
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TOwnerHouse implements Serializable {
    private Integer ohId;

    private Integer houseId;

    private THouse tHouse;

    private Integer ownerId;

    private String houseNo;

    private Date decorateDate;

    private String ohRemark;

    private String houseName;

    private static final long serialVersionUID = 1L;
}