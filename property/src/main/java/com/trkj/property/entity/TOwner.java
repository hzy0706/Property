package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_owner
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TOwner implements Serializable {
    private Integer ownerId;

    private String ownerType;

    private String ownerName;

    private String ownerSex;

    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date ownerBirth;

    private String ownerNation;

    private String ownerEducation;

    private String ownerNotype;

    private String ownerNo;

    private String ownerWork;

    private String ownerPhone;

    private String urgentName;

    private String urgentPhone;

    private Integer familyCount;

    private Integer houseCount;
    private static final long serialVersionUID = 1L;
}