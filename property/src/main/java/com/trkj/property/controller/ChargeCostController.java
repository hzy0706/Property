package com.trkj.property.controller;

import com.trkj.property.entity.TChargeCosts;
import com.trkj.property.exception.CustomError;
import com.trkj.property.exception.CustomErrorType;
import com.trkj.property.service.ChargeCostService;
import com.trkj.property.vo.AjaxResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("chargeCosts")
public class ChargeCostController {

    @Autowired
    private ChargeCostService chargeCostService;

    @GetMapping("getByHoseId/{houseId}")
    public AjaxResponse getChargeCotsByHoseId(@PathVariable("houseId") Integer houseId){

        List<TChargeCosts> allCostsByHouseId = chargeCostService.findAllCostsByHouseId(houseId);
        System.out.println(allCostsByHouseId);
        if (allCostsByHouseId != null){
            return AjaxResponse.success(allCostsByHouseId);
        }
        if (allCostsByHouseId == null){
            return AjaxResponse.error(new CustomError(CustomErrorType.PAGE_NOT_FOUND_ERROR,"没有找到对应资源，请联系管理员！"));
        }
        //500
        return AjaxResponse.error(new CustomError(CustomErrorType.SYSTEM_ERROR,"服务器出现异常了，开发人员已经在医院进行抢救了"));

    }


}
