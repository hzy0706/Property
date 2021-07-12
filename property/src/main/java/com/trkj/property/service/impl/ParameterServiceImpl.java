package com.trkj.property.service.impl;

import com.trkj.property.dao.TParameterDao;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.entity.TParameter;
import com.trkj.property.entity.TParameterDetail;
import com.trkj.property.service.ParameterService;
import com.trkj.property.vo.ParAndHouse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private TParameterDao parameterDao;


    /**
     * 新增台账、台账详情信息
     * @param tParameter
     * @return
     */
    @Override
    public Integer addParameter(TParameter tParameter) {

        //获取费项id 通过费项id将费项的信息查出来获取到  单价  计算应缴费用
        Integer ctId = tParameter.getTParameterDetail().getCtId();
        System.out.println(ctId);
        TCostitem costItem = parameterDao.getCostItemById(ctId);
        System.out.println(costItem);

        //新增台账信息
        tParameter.setParCostname(costItem.getCtName());
        Integer integer = parameterDao.addParameter(tParameter);

        if (integer > 0){
            //给台账详情赋值并 新增台账详情信息
            TParameterDetail tParameterDetail = tParameter.getTParameterDetail();
            //算钱
            tParameterDetail.setParDeAssessment(costItem.getCtSubtotal());
            Integer addDetailState = parameterDao.addParameterDetail(tParameterDetail);
            return addDetailState;
        }else{
            return null;
        }


    }

    @Override
    public List<ParAndHouse> findAllParByResId(Integer residenceId) {
        List<ParAndHouse> allPar = parameterDao.findAllParByResId(residenceId);
        return allPar;
    }
}
