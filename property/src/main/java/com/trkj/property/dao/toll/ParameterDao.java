package com.trkj.property.dao.toll;

import com.trkj.property.entity.toll.Parameter;

public interface ParameterDao {
    int deleteByPrimaryKey(Integer parId);

    int insert(Parameter record);

    int insertSelective(Parameter record);

    Parameter selectByPrimaryKey(Integer parId);

    int updateByPrimaryKeySelective(Parameter record);

    int updateByPrimaryKey(Parameter record);
}