package com.trkj.property.service.impl;

import com.trkj.property.dao.TParkingDao;
import com.trkj.property.entity.TParking;
import com.trkj.property.entity.TParkingsales;
import com.trkj.property.service.TParKingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class TParKingServiceImpl implements TParKingService {

    @Resource
    private TParkingDao tParkingDao;
    @Override
    public List<TParking> selectTParKing() {

        return tParkingDao.selectTParKing();
    }

    @Override
    public TParking insertTRarKing(TParking tParking) {
        log.debug("新增车位信息");
        tParkingDao.insertTRarKing(tParking);
        return tParking;
    }

    @Override
    public TParking updateTParKing(TParking tParking) {
        log.debug("修改成功");
        tParkingDao.updateTParKing(tParking);
        return tParking;
    }

//    多条件查询
    @Override
    public List<TParking> selectstate(String value3,String value2) {
        return tParkingDao.selectstate(value3,value2);
    }
    @Override
    public List<TParkingsales> selectmanagemen() {
        return tParkingDao.selectmanagemen();
    }

    @Override
    public TParking updateState(TParking tParking) {
        log.debug("修改状态");
        tParkingDao.updateState(tParking);
        return tParking;
    }


}
