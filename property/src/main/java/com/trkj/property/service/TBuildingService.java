package com.trkj.property.service;

import com.trkj.property.entity.TBuilding;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 10:18
 */
public interface TBuildingService {
    TBuilding selectByTBuildingKey(Integer buildingId);

    List<TBuilding> selectAllTBuildingByRid(Integer residenceId);
}
