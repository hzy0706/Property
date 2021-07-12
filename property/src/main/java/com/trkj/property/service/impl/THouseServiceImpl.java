package com.trkj.property.service.impl;

import com.trkj.property.dao.THouseDao;
import com.trkj.property.entity.THouse;
import com.trkj.property.service.THouseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 9:47
 */
@Service
public class THouseServiceImpl implements THouseService {
    @Resource
    private THouseDao tHouseDao;
    @Override
    public THouse selectByTHouseKey(Integer houseId) {
        return tHouseDao.selectByTHouseKey(houseId);
    }

    @Override
    public List<THouse> selectAllTHouseByUid(Integer unitId) {
        return tHouseDao.selectAllTHouseByUid(unitId);
    }

    @Override
    @Transactional
    public void updateByTHouseKeySelective(THouse record) {
        tHouseDao.updateByTHouseKeySelective(record);
    }
}
