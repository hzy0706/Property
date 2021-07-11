package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_owner
 * @author 
 */
@Data
public class TOwner implements Serializable {
    private Integer ownerId;

    private String ownerType;

    private String ownerName;

    private String ownerSex;

    private Date ownerBirth;

    private String ownerNation;

    private String ownerEducation;

    private String ownerNotype;

    private String ownerNo;

    private String ownerWork;

    private String ownerPhone;

    private String urgentName;

    private String urgentPhone;

    private static final long serialVersionUID = 1L;
}