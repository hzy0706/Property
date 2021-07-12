package com.trkj.property.dao;

import com.trkj.property.entity.TUnit;

import java.util.List;

public interface TUnitDao {

    TUnit selectByTUnitKey(Integer unitId);

    List<TUnit> selectAllTUnitByBid(Integer buildingId);

}