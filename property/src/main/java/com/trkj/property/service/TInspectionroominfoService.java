package com.trkj.property.service;

import com.trkj.property.entity.TInspectionroominfo;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 11:23
 */
public interface TInspectionroominfoService {
    void deleteByTInspectionroominfoKey(Integer irinfoId);

    void addTInspectionroominfo(TInspectionroominfo record);

    TInspectionroominfo selectByTInspectionroominfoKey(Integer irinfoId);

    List<TInspectionroominfo> selectAllTInspectionroominfoByIrid(Integer irid);

    void updateByTInspectionroominfoKeySelective(TInspectionroominfo record);
}
