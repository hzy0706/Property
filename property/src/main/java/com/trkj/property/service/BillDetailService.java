package com.trkj.property.service;

import com.trkj.property.entity.TBillDetail;

import java.util.List;

public interface BillDetailService {

    /**
     * 新增账单详情
     * @param tBillDetail
     * @return
     */
    Integer addBillDetail(TBillDetail tBillDetail);

    /**
     * 查看所有账单
     */
    List<TBillDetail> findAllDetail();

    /**
     * 根据房间号查询账单列表
     */
    List<TBillDetail> findBillDetailByHouseId(Integer houseId);

}
