package com.trkj.property.dao;

import com.trkj.property.entity.TCostitem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TCostitemDao {
    int deleteByPrimaryKey(Integer ctId);

    int insert(TCostitem record);

    int insertSelective(TCostitem record);

    TCostitem selectByPrimaryKey(Integer ctId);

    int updateByPrimaryKeySelective(TCostitem record);

    int updateByPrimaryKey(TCostitem record);
}