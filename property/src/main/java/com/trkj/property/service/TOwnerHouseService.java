package com.trkj.property.service;

import com.trkj.property.entity.TOwnerHouse;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 0:21
 */
public interface TOwnerHouseService {
    void deleteByTOwnerHouseKey(Integer ohId);

    void addTOwnerHouse(TOwnerHouse record);

    TOwnerHouse selectByTOwnerHouseKey(Integer ohId);

    List<TOwnerHouse> selectAllTOwnerHouseByTid(Integer ownerId);

    TOwnerHouse selectTOwnerHouseByHouseId(Integer houseId);

    void updateByTOwnerHouseKeySelective(TOwnerHouse record);
}
