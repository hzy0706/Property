package com.trkj.property.dao;

import com.trkj.property.entity.TDecorate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TDecorateDao {
    void deleteByTDecorateKey(Integer decorateId);

    void addTDecorate(TDecorate record);

    TDecorate selectByTDecorateKey(Integer decorateId);

    List<TDecorate> selectAllTDecorateByState(Integer state,String value);

    List<TDecorate> selectAllTDecorates(String value);

    void updateByTDecorateKeySelective(TDecorate record);

    void updateByTDecorateKey(TDecorate record);
}