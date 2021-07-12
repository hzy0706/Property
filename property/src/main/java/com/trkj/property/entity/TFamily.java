package com.trkj.property.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private String sibName;

    private String sibRelation;

    private String sibPhone;

    private String sibSex;

    private String sibNotype;

    private String sibNo;

    private String sibWork;

    private String sibEducation;

    @JsonFormat(timezone="GMT+8",pattern = "yyyy-MM-dd")
    private Date ownerBirth;

    private static final long serialVersionUID = 1L;
}