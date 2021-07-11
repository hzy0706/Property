package com.trkj.property.service.impl;

import com.trkj.property.dao.TOwnerDao;
import com.trkj.property.entity.TOwner;
import com.trkj.property.service.TOwnerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/11 19:23
 */
@Service
public class TOwnerServiceImpl implements TOwnerService {
    @Resource
    private TOwnerDao tOwnerDao;

    @Override
    @Transactional
    public void deleteByTOwnerKey(Integer ownerId) {
        tOwnerDao.deleteByTOwnerKey(ownerId);
    }

    @Override
    @Transactional
    public void addTOwner(TOwner record) {
        tOwnerDao.addTOwner(record);
    }

    @Override
    public List<TOwner> selectAllTOwners(String value) {
        return tOwnerDao.selectAllTOwners(value);
    }

    @Override
    public TOwner selectByTOwnerKey(Integer ownerId) {
        return tOwnerDao.selectByTOwnerKey(ownerId);
    }

    @Override
    @Transactional
    public void updateByTOwnerKeySelective(TOwner record) {
        tOwnerDao.updateByTOwnerKeySelective(record);
    }
}
