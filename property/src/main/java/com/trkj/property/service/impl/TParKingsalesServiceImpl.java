package com.trkj.property.service.impl;

import com.trkj.property.dao.TParkingsalesDao;
import com.trkj.property.entity.TParkingsales;
import com.trkj.property.service.TParKingsalesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class TParKingsalesServiceImpl implements TParKingsalesService {
    @Resource
    private TParkingsalesDao tParkingsalesDao;
    @Override
    //显示车位销售信息
    public List<TParkingsales> selectTParKingsales() {
        return tParkingsalesDao.selectTParKingsales();
    }

    @Override
    public TParkingsales updateTParkingSales(TParkingsales tParkingsales) {
        log.debug("修改成功");
        tParkingsalesDao.updateTParkingSales(tParkingsales);
        return tParkingsales;
    }

    @Override
    public TParkingsales insertTParKing(TParkingsales tParkingsales) {
        log.debug("新增成功");
        tParkingsalesDao.insertTParKing(tParkingsales);
        return tParkingsales;
    }
//模糊查询
    @Override
    public List<TParkingsales> selectlicense(String value1, String value2) {
        return tParkingsalesDao.selectlicense(value1, value2);
    }


}
