package com.trkj.property.service.impl;

import com.trkj.property.dao.TInspectionroomDao;
import com.trkj.property.entity.TInspectionroom;
import com.trkj.property.service.TInspectionroomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 11:10
 */
@Service
public class TInspectionroomServiceImpl implements TInspectionroomService {
    @Resource
    private TInspectionroomDao tInspectionroomDao;
    @Override
    @Transactional
    public void addTInspectionroom(TInspectionroom record) {
        tInspectionroomDao.addTInspectionroom(record);
    }

    @Override
    public TInspectionroom selectByTInspectionroomKey(Integer irId) {
        return tInspectionroomDao.selectByTInspectionroomKey(irId);
    }

    @Override
    public List<TInspectionroom> selectAllTInspectionroomByRoomName(String value) {
        return tInspectionroomDao.selectAllTInspectionroomByRoomName(value);
    }

    @Override
    public TInspectionroom selectTInspectionroomByHourseid(Integer hourseid) {
        return tInspectionroomDao.selectTInspectionroomByHourseid(hourseid);
    }

    @Override
    @Transactional
    public void updateByTInspectionroomKeySelective(TInspectionroom record) {
        tInspectionroomDao.updateByTInspectionroomKeySelective(record);
    }
}
