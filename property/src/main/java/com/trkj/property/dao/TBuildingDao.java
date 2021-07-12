package com.trkj.property.dao;

import com.trkj.property.entity.TBuilding;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TBuildingDao {

    TBuilding selectByTBuildingKey(Integer buildingId);

    List<TBuilding> selectAllTBuildingByRid(Integer residenceId);
}