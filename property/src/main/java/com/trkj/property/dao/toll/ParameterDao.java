package com.trkj.property.dao.toll;
import com.trkj.property.entity.toll.ParameterEntity;

public interface ParameterDao {
    int deleteByPrimaryKey(Integer parId);

    int insert(ParameterEntity record);

    int insertSelective(ParameterEntity record);

    ParameterEntity selectByPrimaryKey(Integer parId);

    int updateByPrimaryKeySelective(ParameterEntity record);

    int updateByPrimaryKey(ParameterEntity record);
}