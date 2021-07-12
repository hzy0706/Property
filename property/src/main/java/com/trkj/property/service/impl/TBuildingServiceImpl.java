package com.trkj.property.service.impl;

import com.trkj.property.dao.TBuildingDao;
import com.trkj.property.entity.TBuilding;
import com.trkj.property.service.TBuildingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 10:18
 */
@Service
public class TBuildingServiceImpl implements TBuildingService {
    @Resource
    private TBuildingDao tBuildingDao;
    @Override
    public TBuilding selectByTBuildingKey(Integer buildingId) {
        return tBuildingDao.selectByTBuildingKey(buildingId);
    }

    @Override
    public List<TBuilding> selectAllTBuildingByRid(Integer residenceId) {
        return tBuildingDao.selectAllTBuildingByRid(residenceId);
    }
}
