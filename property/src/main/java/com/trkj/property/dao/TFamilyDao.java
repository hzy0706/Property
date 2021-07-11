package com.trkj.property.dao;

import com.trkj.property.entity.TFamily;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TFamilyDao {
    void deleteByTFamilyKey(Integer sibId);

    void addTFamily(TFamily record);

    TFamily selectByTFamilyKey(Integer sibId);

    List<TFamily> selectAllTFamilyByTid(Integer ownerId);

    void updateByTFamilyKeySelective(TFamily record);
}