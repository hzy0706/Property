package com.trkj.property.service;

import com.trkj.property.entity.TChargeCosts;
import com.trkj.property.entity.TParameterDetail;

import java.util.List;

public interface ChargeCostService {


    /**
     * 查询该房间的所有需交费项
     */
    List<TChargeCosts> findAllCostsByHouseId(Integer houseId);


}
