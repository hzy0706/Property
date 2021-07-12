package com.trkj.property.dao;

import com.trkj.property.entity.TMaintain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TMaintainDao {
    void deleteByTMaintainKey(Integer maintainId);

    void addTMaintain(TMaintain record);

    TMaintain selectByTMaintainKey(Integer maintainId);

    List<TMaintain> selectAllTMaintainByState(Integer state,String value);

    void updateByTMaintainKeySelective(TMaintain record);

    void updateByTMaintainKey(TMaintain record);
}