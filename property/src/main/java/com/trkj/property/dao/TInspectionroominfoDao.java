package com.trkj.property.dao;

import com.trkj.property.entity.TInspectionroominfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TInspectionroominfoDao {
    void deleteByTInspectionroominfoKey(Integer irinfoId);

    void addTInspectionroominfo(TInspectionroominfo record);

    TInspectionroominfo selectByTInspectionroominfoKey(Integer irinfoId);

    List<TInspectionroominfo> selectAllTInspectionroominfoByIrid(Integer irid);

    void updateByTInspectionroominfoKeySelective(TInspectionroominfo record);

}