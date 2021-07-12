package com.trkj.property.service.impl;

import com.trkj.property.dao.TDecorateDao;
import com.trkj.property.entity.TDecorate;
import com.trkj.property.service.TDecorateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 8:32
 */
@Service
public class TDecorateServiceImpl implements TDecorateService {
    @Resource
    private TDecorateDao tDecorateDao;
    @Override
    @Transactional
    public void deleteByTDecorateKey(Integer decorateId) {
        tDecorateDao.deleteByTDecorateKey(decorateId);
    }

    @Override
    @Transactional
    public void addTDecorate(TDecorate record) {
        tDecorateDao.addTDecorate(record);
    }

    @Override
    public TDecorate selectByTDecorateKey(Integer decorateId) {
        return tDecorateDao.selectByTDecorateKey(decorateId);
    }

    @Override
    public List<TDecorate> selectAllTDecorateByState(Integer state, String value) {
        return tDecorateDao.selectAllTDecorateByState(state,value);
    }

    @Override
    @Transactional
    public void updateByTDecorateKeySelective(TDecorate record) {
        tDecorateDao.updateByTDecorateKeySelective(record);
    }

    @Override
    @Transactional
    public void updateByTDecorateKey(TDecorate record) {
        tDecorateDao.updateByTDecorateKey(record);
    }
}
