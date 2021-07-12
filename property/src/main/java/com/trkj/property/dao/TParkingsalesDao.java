package com.trkj.property.dao;

import com.trkj.property.entity.TParkingsales;

import java.util.List;

public interface TParkingsalesDao {
    int deleteByPrimaryKey(Integer parkingsalesId);

    int insert(TParkingsales record);

    int insertSelective(TParkingsales record);

    List<TParkingsales> selectTParKingsales();

    int updateByPrimaryKeySelective(TParkingsales record);

    int updateByPrimaryKey(TParkingsales record);
}