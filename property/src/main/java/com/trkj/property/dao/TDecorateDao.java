package com.trkj.property.dao;

import com.trkj.property.entity.TDecorate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TDecorateDao {
    int deleteByPrimaryKey(Integer decorateId);

    int insert(TDecorate record);

    int insertSelective(TDecorate record);

    TDecorate selectByPrimaryKey(Integer decorateId);

    int updateByPrimaryKeySelective(TDecorate record);

    int updateByPrimaryKey(TDecorate record);
}