package com.trkj.property.dao;

import com.trkj.property.entity.THouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface THouseDao {
    THouse selectByTHouseKey(Integer houseId);

    List<THouse> selectAllTHouseByUid(Integer unitId);

    void updateByTHouseKeySelective(THouse record);
}