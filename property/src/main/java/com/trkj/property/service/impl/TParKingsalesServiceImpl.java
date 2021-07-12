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
}
