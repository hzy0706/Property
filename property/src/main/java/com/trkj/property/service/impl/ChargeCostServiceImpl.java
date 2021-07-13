package com.trkj.property.service.impl;

import com.trkj.property.dao.ChargeCostDao;
import com.trkj.property.entity.TChargeCosts;
import com.trkj.property.service.ChargeCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChargeCostServiceImpl implements ChargeCostService {

    @Autowired
    private ChargeCostDao chargeCostDao;

    @Override
    public List<TChargeCosts> findAllCostsByHouseId(Integer houseId) {
        List<TChargeCosts> allByHouseId = chargeCostDao.findAllByHouseId(houseId);
        return allByHouseId;
    }
}
