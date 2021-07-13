package com.trkj.property.service.impl;

import com.trkj.property.dao.TResidenceDao;
import com.trkj.property.entity.TResidence;
import com.trkj.property.service.TResidenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 19:40
 */
@Service
public class TResidenceServiceImpl implements TResidenceService {
    @Resource
    private TResidenceDao tResidenceDao;
    @Override
    @Transactional
    public void deleteByPrimaryKey(Integer residenceId) {
        tResidenceDao.deleteByPrimaryKey(residenceId);
    }

    @Override
    @Transactional
    public void insert(TResidence record) {
        tResidenceDao.insert(record);
    }

    @Override
    @Transactional
    public void insertSelective(TResidence record) {
        tResidenceDao.insertSelective(record);
    }

    @Override
    public TResidence selectByPrimaryKey(Integer residenceId) {
        return tResidenceDao.selectByPrimaryKey(residenceId);
    }

    @Override
    public List<TResidence> selectAllTResidence() {
        return tResidenceDao.selectAllTResidence();
    }

    @Override
    @Transactional
    public void updateByPrimaryKeySelective(TResidence record) {
        tResidenceDao.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public void updateByPrimaryKey(TResidence record) {
        tResidenceDao.updateByPrimaryKey(record);
    }

    @Override
    public TResidence queryById(Integer residenceId) {
        return this.tResidenceDao.queryById(residenceId);
    }
}
