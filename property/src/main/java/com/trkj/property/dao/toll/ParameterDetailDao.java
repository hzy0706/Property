package com.trkj.property.dao.toll;

import com.trkj.property.entity.toll.ParameterDetail;

public interface ParameterDetailDao {
    int deleteByPrimaryKey(Integer parDeId);

    int insert(ParameterDetail record);

    int insertSelective(ParameterDetail record);

    ParameterDetail selectByPrimaryKey(Integer parDeId);

    int updateByPrimaryKeySelective(ParameterDetail record);

    int updateByPrimaryKey(ParameterDetail record);
}