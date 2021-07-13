package com.trkj.property.service.impl;

import com.trkj.property.dao.*;
import com.trkj.property.entity.*;
import com.trkj.property.service.TInspectionroominfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 11:23
 */
@Service
public class TInspectionroominfoServiceImpl implements TInspectionroominfoService {
    @Resource
    private TInspectionroominfoDao tInspectionroominfoDao;
    @Resource
    private TInspectionroomDao tInspectionroomDao;
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
    public void deleteByTInspectionroominfoKey(Integer irinfoId) {
        tInspectionroominfoDao.deleteByTInspectionroominfoKey(irinfoId);
    }

    @Override
    @Transactional
    public void addTInspectionroominfo(TInspectionroominfo record) {
        TInspectionroom tInspectionroom = tInspectionroomDao.selectTInspectionroomByHourseid(record.getHouseId());
        if(tInspectionroom == null){
            //添加验收总表
            TResidence tResidence = tResidenceDao.selectByPrimaryKey(record.getRid());
            TBuilding tBuilding = tBuildingDao.selectByTBuildingKey(record.getBid());
            TUnit tUnit = tUnitDao.selectByTUnitKey(record.getUid());
            THouse tHouse = tHouseDao.selectByTHouseKey(record.getHouseId());
            TInspectionroom tInspectionroom1 = new TInspectionroom();
            tInspectionroom1.setHouseName(tResidence.getResidenceName()+"#"+tBuilding.getBuildingName()+"#"+tUnit.getUnitName()+"#"+tHouse.getHouseName());
            tInspectionroom1.setHouseId(record.getHouseId());
            if(record.getIsOk()==0){
                tInspectionroom1.setOkcount(1);
                tInspectionroom1.setNocount(0);
            }else{
                tInspectionroom1.setNocount(1);
                tInspectionroom1.setOkcount(0);
            }
            tInspectionroomDao.addTInspectionroom(tInspectionroom1);
            record.setIrId(tInspectionroom1.getIrId());
            tInspectionroominfoDao.addTInspectionroominfo(record);
        }else{
            TInspectionroom tInspectionroom2 = tInspectionroomDao.selectTInspectionroomByHourseid(record.getHouseId());
            if(record.getIsOk()==0){
                tInspectionroom2.setOkcount(tInspectionroom2.getOkcount()+1);
            }else{
                tInspectionroom2.setNocount(tInspectionroom2.getNocount()+1);
            }
            tInspectionroomDao.updateByTInspectionroomKeySelective(tInspectionroom2);
            record.setIrId(tInspectionroom2.getIrId());
            tInspectionroominfoDao.addTInspectionroominfo(record);
        }
    }

    @Override
    public TInspectionroominfo selectByTInspectionroominfoKey(Integer irinfoId) {
        return tInspectionroominfoDao.selectByTInspectionroominfoKey(irinfoId);
    }

    @Override
    public List<TInspectionroominfo> selectAllTInspectionroominfoByIrid(Integer irid) {
        return tInspectionroominfoDao.selectAllTInspectionroominfoByIrid(irid);
    }

    @Override
    @Transactional
    public void updateByTInspectionroominfoKeySelective(TInspectionroominfo record) {
        tInspectionroominfoDao.updateByTInspectionroominfoKeySelective(record);
    }
}
