package com.trkj.property.service.impl;

import com.trkj.property.dao.TFamilyDao;
import com.trkj.property.dao.TOwnerDao;
import com.trkj.property.entity.TFamily;
import com.trkj.property.entity.TOwner;
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
    @Resource
    private TOwnerDao tOwnerDao;
    @Override
    @Transactional
    public void deleteByTFamilyKey(Integer sibId,Integer oid) {
        //删除家庭成员信息
        tFamilyDao.deleteByTFamilyKey(sibId);
        //修改业主家属数量
        TOwner tOwner = tOwnerDao.selectByTOwnerKey(oid);
        tOwner.setFamilyCount(tOwner.getFamilyCount()-1);
        tOwnerDao.updateByTOwnerKeySelective(tOwner);
    }

    @Override
    @Transactional
    public void addTFamily(TFamily record) {
        //添加家庭成员信息
        tFamilyDao.addTFamily(record);

        //修改业主成员数量
        TOwner tOwner = tOwnerDao.selectByTOwnerKey(record.getOwnerId());
        tOwner.setFamilyCount(tOwner.getFamilyCount()+1);
        tOwnerDao.updateByTOwnerKeySelective(tOwner);
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
