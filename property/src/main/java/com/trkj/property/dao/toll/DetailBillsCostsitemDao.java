package com.trkj.property.dao.toll;

import com.trkj.property.entity.toll.DetailBillsCostsitemEntity;

public interface DetailBillsCostsitemDao {
    int deleteByPrimaryKey(Integer detailChargesId);

    int insert(DetailBillsCostsitemEntity record);

    int insertSelective(DetailBillsCostsitemEntity record);

    DetailBillsCostsitemEntity selectByPrimaryKey(Integer detailChargesId);

    int updateByPrimaryKeySelective(DetailBillsCostsitemEntity record);

    int updateByPrimaryKey(DetailBillsCostsitemEntity record);
}