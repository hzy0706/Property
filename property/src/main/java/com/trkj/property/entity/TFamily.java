package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_family
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TFamily implements Serializable {
    private Integer sibId;

    private Integer ownerId;

    private TOwner tOwner;

    private String sibName;

    private String sibRelation;

    private String sibPhone;

    private String sibSex;

    private String sibNotype;

    private String sibNo;

    private String sibWork;

    private String sibEducation;

    private Date ownerBirth;

    private static final long serialVersionUID = 1L;
}