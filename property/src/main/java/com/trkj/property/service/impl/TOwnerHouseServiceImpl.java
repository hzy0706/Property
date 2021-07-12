package com.trkj.property.service.impl;

import com.trkj.property.dao.*;
import com.trkj.property.entity.*;
import com.trkj.property.service.TOwnerHouseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 0:22
 */
@Service
public class TOwnerHouseServiceImpl implements TOwnerHouseService {
    @Resource
    private TOwnerHouseDao tOwnerHouseDao;
    @Resource
    private TOwnerDao tOwnerDao;
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
    public void deleteByTOwnerHouseKey(Integer ohId) {
        TOwnerHouse tOwnerHouse = tOwnerHouseDao.selectByTOwnerHouseKey(ohId);
        //删除房产记录
        tOwnerHouseDao.deleteByTOwnerHouseKey(ohId);
        //修改业主房产数量
        TOwner tOwner = tOwnerDao.selectByTOwnerKey(tOwnerHouse.getOwnerId());
        tOwner.setHouseCount(tOwner.getHouseCount()-1);
        tOwnerDao.updateByTOwnerKeySelective(tOwner);

        //修改房间状态
        THouse tHouse = tHouseDao.selectByTHouseKey(tOwnerHouse.getHouseId());
        tHouse.setHouseState(0);
        tHouseDao.updateByTHouseKeySelective(tHouse);
    }

    @Override
    @Transactional
    public void addTOwnerHouse(TOwnerHouse record) {
        //获得房产名
        TResidence tResidence = tResidenceDao.selectByPrimaryKey(record.getRid());
        TBuilding tBuilding = tBuildingDao.selectByTBuildingKey(record.getBid());
        TUnit tUnit = tUnitDao.selectByTUnitKey(record.getUid());
        THouse tHouse = tHouseDao.selectByTHouseKey(record.getHouseId());
        record.setHouseName(tResidence.getResidenceName()+tBuilding.getBuildingName()+tUnit.getUnitName()+tHouse.getHouseName());
        //添加业主房产
        tOwnerHouseDao.addTOwnerHouse(record);

        //修改业主房产数量
        TOwner tOwner = tOwnerDao.selectByTOwnerKey(record.getOwnerId());
        tOwner.setHouseCount(tOwner.getHouseCount()+1);
        tOwnerDao.updateByTOwnerKeySelective(tOwner);

        //修改房间状态
        tHouse.setHouseState(1);
        tHouseDao.updateByTHouseKeySelective(tHouse);
    }

    @Override
    public TOwnerHouse selectByTOwnerHouseKey(Integer ohId) {
        return tOwnerHouseDao.selectByTOwnerHouseKey(ohId);
    }

    @Override
    public List<TOwnerHouse> selectAllTOwnerHouseByTid(Integer ownerId) {
        return tOwnerHouseDao.selectAllTOwnerHouseByTid(ownerId);
    }

    @Override
    @Transactional
    public void updateByTOwnerHouseKeySelective(TOwnerHouse record) {
        tOwnerHouseDao.updateByTOwnerHouseKeySelective(record);
    }
}
