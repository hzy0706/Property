package com.trkj.property.dao.toll;

import com.trkj.property.entity.toll.ChargeCostsEntity;

public interface ChargeCostsDao {
    int deleteByPrimaryKey(Integer chargeCostsId);

    int insert(ChargeCostsEntity record);

    int insertSelective(ChargeCostsEntity record);

    ChargeCostsEntity selectByPrimaryKey(Integer chargeCostsId);

    int updateByPrimaryKeySelective(ChargeCostsEntity record);

    int updateByPrimaryKey(ChargeCostsEntity record);
}