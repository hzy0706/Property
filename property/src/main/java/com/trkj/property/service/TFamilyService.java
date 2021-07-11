package com.trkj.property.service;

import com.trkj.property.entity.TFamily;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/11 21:52
 */
public interface TFamilyService {
    void deleteByTFamilyKey(Integer sibId);

    void addTFamily(TFamily record);

    TFamily selectByTFamilyKey(Integer sibId);

    List<TFamily> selectAllTFamilyByTid(Integer ownerId);

    void updateByTFamilyKeySelective(TFamily record);
}
