package com.trkj.property.service;

import com.trkj.property.entity.TOwner;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/11 19:22
 */
public interface TOwnerService {
    void deleteByTOwnerKey(Integer ownerId);

    void addTOwner(TOwner record);

    List<TOwner> selectAllTOwners(String value);

    TOwner selectByTOwnerKey(Integer ownerId);

    void updateByTOwnerKeySelective(TOwner record);
}
