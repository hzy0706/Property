package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private Integer rid;
    private Integer bid;
    private Integer uid;

    private Integer houseId;

    private THouse tHouse;

    private Integer ownerId;

    private TOwner tOwner;

    private String houseNo;
    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date decorateDate;

    private String ohRemark;

    private String houseName;

    private static final long serialVersionUID = 1L;
}