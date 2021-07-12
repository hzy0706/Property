package com.trkj.property.service;

import com.trkj.property.entity.TDecorate;

import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 8:32
 */
public interface TDecorateService {
    void deleteByTDecorateKey(Integer decorateId);

    void addTDecorate(TDecorate record);

    TDecorate selectByTDecorateKey(Integer decorateId);

    List<TDecorate> selectAllTDecorateByState(Integer state, String value);

    void updateByTDecorateKeySelective(TDecorate record);

    void updateByTDecorateKey(TDecorate record);
}
