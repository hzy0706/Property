package com.trkj.property.service.impl;

import com.trkj.property.dao.TFamilyDao;
import com.trkj.property.entity.TFamily;
import com.trkj.property.service.TFamilyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/11 21:52
 */
@Service
public class TFamilyServiceImpl implements TFamilyService {
    @Resource
    private TFamilyDao tFamilyDao;

    @Override
    @Transactional
    public void deleteByTFamilyKey(Integer sibId) {
        tFamilyDao.deleteByTFamilyKey(sibId);
    }

    @Override
    @Transactional
    public void addTFamily(TFamily record) {
        tFamilyDao.addTFamily(record);
    }

    @Override
    public TFamily selectByTFamilyKey(Integer sibId) {
        return tFamilyDao.selectByTFamilyKey(sibId);
    }

    @Override
    public List<TFamily> selectAllTFamilyByTid(Integer ownerId) {
        return tFamilyDao.selectAllTFamilyByTid(ownerId);
    }

    @Override
    @Transactional
    public void updateByTFamilyKeySelective(TFamily record) {
        tFamilyDao.updateByTFamilyKeySelective(record);
    }
}
