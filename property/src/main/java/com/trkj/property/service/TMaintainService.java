package com.trkj.property.service;

import com.trkj.property.entity.TMaintain;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 9:19
 */
public interface TMaintainService {
    void deleteByTMaintainKey(Integer maintainId);

    void addTMaintain(TMaintain record);

    TMaintain selectByTMaintainKey(Integer maintainId);

    List<TMaintain> selectAllTMaintainByState(Integer state, String value);

    List<TMaintain> selectAllTMaintains(String value);

    void updateByTMaintainKeySelective(TMaintain record);

    void updateByTMaintainKey(TMaintain record);
}
