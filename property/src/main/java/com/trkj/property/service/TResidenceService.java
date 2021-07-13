package com.trkj.property.service;

import com.trkj.property.entity.TResidence;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 19:39
 */
public interface TResidenceService {
    void deleteByPrimaryKey(Integer residenceId);

    void insert(TResidence record);

    void insertSelective(TResidence record);

    TResidence selectByPrimaryKey(Integer residenceId);

    List<TResidence> selectAllTResidence();

    void updateByPrimaryKeySelective(TResidence record);

    void updateByPrimaryKey(TResidence record);
}
