package com.trkj.property.service.impl;

import com.trkj.property.dao.TMaintainDao;
import com.trkj.property.entity.TMaintain;
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
    @Override
    @Transactional
    public void deleteByTMaintainKey(Integer maintainId) {
        tMaintainDao.deleteByTMaintainKey(maintainId);
    }

    @Override
    @Transactional
    public void addTMaintain(TMaintain record) {
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
