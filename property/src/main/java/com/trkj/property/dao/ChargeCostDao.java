package com.trkj.property.dao;

import com.trkj.property.entity.TChargeCosts;
import com.trkj.property.entity.TParameterDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;

import java.util.List;

@Mapper
public interface ChargeCostDao {

    /**
     * 查询所有符合要求的台账详情信息
     */
    List<TParameterDetail> findAllParDetail();


    /**
     * 新增收费记录
     */
    Integer addCharge(TChargeCosts tChargeCosts);

    /**
     * 将对应的台账详情表中的起始时间+1月
     */
    Integer updateParDetailByDate(TParameterDetail tParameterDetail);

    /**
     * 查询该业主的所有收费项
     */
    List<TChargeCosts> findAllByHouseId(@Param("houseId") Integer houseId);


}
