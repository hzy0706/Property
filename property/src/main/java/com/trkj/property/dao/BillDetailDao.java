package com.trkj.property.dao;

import com.trkj.property.entity.TBillDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 账单详情
 */
@Mapper
public interface BillDetailDao {

    Integer addBillDeatil(TBillDetail tBillDetail);

    /**
     * 查询全部的账单记录
     */
    List<TBillDetail> findAllBillDetails();


    /**
     * 根据房间查
     * @return
     */
    List<TBillDetail> findBillDetailByHouseId(@Param("houseId") Integer houseId);
}
