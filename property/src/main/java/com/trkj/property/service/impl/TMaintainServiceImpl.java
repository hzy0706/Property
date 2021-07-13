package com.trkj.property.service.impl;

import com.trkj.property.dao.*;
import com.trkj.property.entity.*;
import com.trkj.property.service.TMaintainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 9:19
 */
@Service
public class TMaintainServiceImpl implements TMaintainService {
    @Resource
    private TMaintainDao tMaintainDao;
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
    public void deleteByTMaintainKey(Integer maintainId) {
        tMaintainDao.deleteByTMaintainKey(maintainId);
    }

    @Override
    @Transactional
    public void addTMaintain(TMaintain record) {
        //获得房产名
        TResidence tResidence = tResidenceDao.selectByPrimaryKey(record.getRid());
        TBuilding tBuilding = tBuildingDao.selectByTBuildingKey(record.getBid());
        TUnit tUnit = tUnitDao.selectByTUnitKey(record.getUid());
        THouse tHouse = tHouseDao.selectByTHouseKey(record.getHouseId());
        record.setHouseName(tResidence.getResidenceName()+"#"+tBuilding.getBuildingName()+"#"+tUnit.getUnitName()+"#"+tHouse.getHouseName());
        tMaintainDao.addTMaintain(record);
    }

    @Override
    public TMaintain selectByTMaintainKey(Integer maintainId) {
        return tMaintainDao.selectByTMaintainKey(maintainId);
    }

    @Override
    public List<TMaintain> selectAllTMaintainByState(Integer state, String value) {
        return tMaintainDao.selectAllTMaintainByState(state,value);
    }

    @Override
    public List<TMaintain> selectAllTMaintains(String value) {
        return tMaintainDao.selectAllTMaintains(value);
    }

    @Override
    @Transactional
    public void updateByTMaintainKeySelective(TMaintain record) {
        tMaintainDao.updateByTMaintainKeySelective(record);
    }

    @Override
    @Transactional
    public void updateByTMaintainKey(TMaintain record) {
        tMaintainDao.updateByTMaintainKey(record);
    }
}
