package com.trkj.property.service;

import com.trkj.property.entity.TUnit;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 10:01
 */
public interface TUnitService {
    TUnit selectByTUnitKey(Integer unitId);

    List<TUnit> selectAllTUnitByBid(Integer buildingId);
}
