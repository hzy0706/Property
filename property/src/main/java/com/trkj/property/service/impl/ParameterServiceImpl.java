package com.trkj.property.service.impl;

import com.trkj.property.dao.TParameterDao;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.entity.TParameter;
import com.trkj.property.entity.TParameterDetail;
import com.trkj.property.service.ParameterService;
import com.trkj.property.vo.GetParsVO;
import com.trkj.property.vo.ParAndHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
    public Integer addParameter(@RequestBody TParameter tParameter) {

        //获取费项id 通过费项id将费项的信息查出来获取到  单价  计算应缴费用
        Integer ctId = tParameter.getTParameterDetail().get(0).getCtId();
        System.out.println(ctId);
        TCostitem costItem = parameterDao.getCostItemById(ctId);
        System.out.println(costItem);

        //台账的id用于区分台账详情的插入情况
        Integer parId = 0;

        //判断台账名字是否在数据库里有一样的，一样的再查一遍数据库后返回台账id
        String parName = tParameter.getParName();
        Integer parIdByNameId = parameterDao.findParIdByName(parName);
        if (parIdByNameId != null){
            parId = parIdByNameId;
            //给台账详情赋值并 新增台账详情信息
            TParameterDetail tParameterDetail = tParameter.getTParameterDetail().get(0);
            //有数据，将这个id放进详情表
            tParameterDetail.setParId(parId);
            //台账费
            tParameterDetail.setParDeAssessment(costItem.getCtSubtotal());
            return parameterDao.addParameterDetail(tParameterDetail);
        }else{
            //新增台账信息
            tParameter.setParCostname(costItem.getCtName());
            Integer integer = parameterDao.addParameter(tParameter);
            if (integer > 0){
                //给台账详情赋值并 新增台账详情信息
                TParameterDetail tParameterDetail = tParameter.getTParameterDetail().get(0);
                //台账费
                tParameterDetail.setParDeAssessment(costItem.getCtSubtotal());
                //将生成的台账id 放到detail中
                parId = tParameter.getParId();
                tParameterDetail.setParId(parId);

                Integer addDetailState = parameterDao.addParameterDetail(tParameterDetail);
                return addDetailState;
            }
            return null;
        }
    }




    @Override
    public List<ParAndHouse> findAllParByResId(Integer residenceId) {
        List<ParAndHouse> allPar = parameterDao.findAllParByResId(residenceId);
        return allPar;
    }

    @Override
    public List<GetParsVO> findDetailsByParName(String parName) {
        //先通过台账名字查台账id
        Integer parId = parameterDao.findParIdByName(parName);
        //再通过id查台账列表
        List<GetParsVO> parDetails = parameterDao.findDetailsByParId(parId);
        return parDetails;
    }
}
