package com.trkj.property.service.impl;

import com.trkj.property.dao.TInspectionroominfoDao;
import com.trkj.property.entity.TInspectionroominfo;
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

    @Override
    @Transactional
    public void deleteByTInspectionroominfoKey(Integer irinfoId) {
        tInspectionroominfoDao.deleteByTInspectionroominfoKey(irinfoId);
    }

    @Override
    @Transactional
    public void addTInspectionroominfo(TInspectionroominfo record) {
        tInspectionroominfoDao.addTInspectionroominfo(record);
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
