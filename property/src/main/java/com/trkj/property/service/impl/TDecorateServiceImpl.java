package com.trkj.property.service.impl;

import com.trkj.property.dao.*;
import com.trkj.property.entity.*;
import com.trkj.property.service.TDecorateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 8:32
 */
@Service
public class TDecorateServiceImpl implements TDecorateService {
    @Resource
    private TDecorateDao tDecorateDao;
    @Resource
    private TResidenceDao tResidenceDao;
    @Resource
    private TBuildingDao tBuildingDao;
    @Resource
    private TUnitDao tUnitDao;
    @Resource
    private THouseDao tHouseDao;

    @Override
    @Transactional
    public void deleteByTDecorateKey(Integer decorateId) {
        tDecorateDao.deleteByTDecorateKey(decorateId);
    }

    @Override
    @Transactional
    public void addTDecorate(TDecorate record) {
        //获得房产名
        TResidence tResidence = tResidenceDao.selectByPrimaryKey(record.getRid());
        TBuilding tBuilding = tBuildingDao.selectByTBuildingKey(record.getBid());
        TUnit tUnit = tUnitDao.selectByTUnitKey(record.getUid());
        THouse tHouse = tHouseDao.selectByTHouseKey(record.getHouseId());
        record.setHouseName(tResidence.getResidenceName()+"#"+tBuilding.getBuildingName()+"#"+tUnit.getUnitName()+"#"+tHouse.getHouseName());
        tDecorateDao.addTDecorate(record);
    }

    @Override
    public TDecorate selectByTDecorateKey(Integer decorateId) {
        return tDecorateDao.selectByTDecorateKey(decorateId);
    }

    @Override
    public List<TDecorate> selectAllTDecorateByState(Integer state, String value) {
        return tDecorateDao.selectAllTDecorateByState(state,value);
    }

    @Override
    public List<TDecorate> selectAllTDecorates(String value) {
        return tDecorateDao.selectAllTDecorates(value);
    }

    @Override
    @Transactional
    public void updateByTDecorateKeySelective(TDecorate record) {
        tDecorateDao.updateByTDecorateKeySelective(record);
    }

    @Override
    @Transactional
    public void updateByTDecorateKey(TDecorate record) {
        tDecorateDao.updateByTDecorateKey(record);
    }
}
