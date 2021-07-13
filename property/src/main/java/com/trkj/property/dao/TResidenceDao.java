package com.trkj.property.dao;

import com.trkj.property.entity.TResidence;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TResidenceDao {
    void deleteByPrimaryKey(Integer residenceId);

    void insert(TResidence record);

    void insertSelective(TResidence record);

    TResidence selectByPrimaryKey(Integer residenceId);

    List<TResidence> selectAllTResidence();

    void updateByPrimaryKeySelective(TResidence record);

    void updateByPrimaryKey(TResidence record);
}