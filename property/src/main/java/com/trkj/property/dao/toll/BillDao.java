package com.trkj.property.dao.toll;

import com.trkj.property.entity.toll.BillEntity;

public interface BillDao {
    int deleteByPrimaryKey(Integer billId);

    int insert(BillEntity record);

    int insertSelective(BillEntity record);

    BillEntity selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(BillEntity record);

    int updateByPrimaryKey(BillEntity record);
}