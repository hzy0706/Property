package com.trkj.property.service.impl;

import com.trkj.property.dao.TOwnerHouseDao;
import com.trkj.property.entity.TOwnerHouse;
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
    @Override
    @Transactional
    public void deleteByTOwnerHouseKey(Integer ohId) {
        tOwnerHouseDao.deleteByTOwnerHouseKey(ohId);
    }

    @Override
    @Transactional
    public void addTOwnerHouse(TOwnerHouse record) {
        tOwnerHouseDao.addTOwnerHouse(record);
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
