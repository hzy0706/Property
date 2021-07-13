package com.trkj.property.dao;

import com.trkj.property.entity.TBill;
import com.trkj.property.entity.TChargeCosts;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.entity.TParameterDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * author:wjh
 */
@Mapper
public interface BillDao {


    /**
     * 新增账单
     */
    Integer addBillByCharge(TBill bill);







}
