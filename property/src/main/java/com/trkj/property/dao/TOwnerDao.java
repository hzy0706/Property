package com.trkj.property.dao;

import com.trkj.property.entity.TOwner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TOwnerDao {
    void deleteByTOwnerKey(Integer ownerId);

    void addTOwner(TOwner record);

    List<TOwner> selectAllTOwners(String value);

    TOwner selectByTOwnerKey(Integer ownerId);

    void updateByTOwnerKeySelective(TOwner record);
}