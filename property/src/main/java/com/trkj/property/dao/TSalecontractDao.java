package com.trkj.property.dao;

import com.trkj.property.entity.TSalecontract;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TSalecontractDao {
    int deleteByPrimaryKey(Integer salecontractId);

    int insert(TSalecontract record);

    int insertSelective(TSalecontract record);

    TSalecontract selectByPrimaryKey(Integer salecontractId);

    int updateByPrimaryKeySelective(TSalecontract record);

    int updateByPrimaryKey(TSalecontract record);
}