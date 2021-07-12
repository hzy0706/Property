package com.trkj.property.dao;

import com.trkj.property.entity.TInspectionroom;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TInspectionroomDao {
    int deleteByTInspectionroomKey(Integer irId);

    int addTInspectionroom(TInspectionroom record);

    TInspectionroom selectByTInspectionroomKey(Integer irId);

    int updateByTInspectionroomKeySelective(TInspectionroom record);

    int updateByTInspectionroomKey(TInspectionroom record);
}