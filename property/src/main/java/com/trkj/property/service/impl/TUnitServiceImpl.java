package com.trkj.property.service.impl;

import com.trkj.property.dao.TUnitDao;
import com.trkj.property.entity.TUnit;
import com.trkj.property.service.TUnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 10:01
 */
@Service
public class TUnitServiceImpl implements TUnitService {
    @Resource
    private TUnitDao tUnitDao;
    @Override
    public TUnit selectByTUnitKey(Integer unitId) {
        return tUnitDao.selectByTUnitKey(unitId);
    }

    @Override
    public List<TUnit> selectAllTUnitByBid(Integer buildingId) {
        return tUnitDao.selectAllTUnitByBid(buildingId);
    }
}
