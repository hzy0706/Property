package com.trkj.property.dao;

import com.trkj.property.entity.TOwner;

public interface TOwnerDao {
    int deleteByPrimaryKey(Integer ownerId);

    int insert(TOwner record);

    int insertSelective(TOwner record);

    TOwner selectByPrimaryKey(Integer ownerId);

    int updateByPrimaryKeySelective(TOwner record);

    int updateByPrimaryKey(TOwner record);
}