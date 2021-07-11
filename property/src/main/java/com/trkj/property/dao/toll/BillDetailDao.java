package com.trkj.property.dao.toll;

import com.trkj.property.entity.toll.BillDetail;

public interface BillDetailDao {
    int deleteByPrimaryKey(Integer billDetailId);

    int insert(BillDetail record);

    int insertSelective(BillDetail record);

    BillDetail selectByPrimaryKey(Integer billDetailId);

    int updateByPrimaryKeySelective(BillDetail record);

    int updateByPrimaryKey(BillDetail record);
}