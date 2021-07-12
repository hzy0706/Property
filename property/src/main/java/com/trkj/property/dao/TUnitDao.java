package com.trkj.property.dao;

import com.trkj.property.entity.TUnit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TUnitDao {

    TUnit selectByTUnitKey(Integer unitId);

    List<TUnit> selectAllTUnitByBid(Integer buildingId);

}