package com.trkj.property.dao;

import com.trkj.property.entity.TResidence;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TResidenceDao {
    int deleteByPrimaryKey(Integer residenceId);

    int insert(TResidence record);

    int insertSelective(TResidence record);

    TResidence selectByPrimaryKey(Integer residenceId);

    int updateByPrimaryKeySelective(TResidence record);

    int updateByPrimaryKey(TResidence record);
}