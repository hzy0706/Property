package com.trkj.property.service;

import com.trkj.property.entity.THouse;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 9:47
 */
public interface THouseService {
    THouse selectByTHouseKey(Integer houseId);

    List<THouse> selectAllTHouseByUid(Integer unitId);

    void updateByTHouseKeySelective(THouse record);
}
