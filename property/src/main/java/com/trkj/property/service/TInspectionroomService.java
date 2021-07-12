package com.trkj.property.service;

import com.trkj.property.entity.TInspectionroom;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 11:10
 */
public interface TInspectionroomService {
    void addTInspectionroom(TInspectionroom record);

    TInspectionroom selectByTInspectionroomKey(Integer irId);

    List<TInspectionroom> selectAllTInspectionroomByRoomName(String value);

    TInspectionroom selectTInspectionroomByHourseid(Integer hourseid);

    void updateByTInspectionroomKeySelective(TInspectionroom record);
}
