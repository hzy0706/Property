package com.trkj.property.dao;

import com.trkj.property.entity.TInspectionroom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TInspectionroomDao {

    void addTInspectionroom(TInspectionroom record);

    TInspectionroom selectByTInspectionroomKey(Integer irId);

    List<TInspectionroom> selectAllTInspectionroomByRoomName(String value);

    TInspectionroom selectTInspectionroomByHourseid(Integer hourseid);

    void updateByTInspectionroomKeySelective(TInspectionroom record);

}