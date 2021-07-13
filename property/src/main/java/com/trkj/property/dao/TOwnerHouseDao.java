package com.trkj.property.dao;

import com.trkj.property.entity.TOwnerHouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TOwnerHouseDao {
    void deleteByTOwnerHouseKey(Integer ohId);

    void addTOwnerHouse(TOwnerHouse record);

    TOwnerHouse selectByTOwnerHouseKey(Integer ohId);

    List<TOwnerHouse> selectAllTOwnerHouseByTid(Integer ownerId);

    TOwnerHouse selectTOwnerHouseByHouseId(Integer houseId);

    void updateByTOwnerHouseKeySelective(TOwnerHouse record);
}