package com.trkj.property.controller;

import com.trkj.property.entity.TParameter;
import com.trkj.property.exception.CustomError;
import com.trkj.property.exception.CustomErrorType;
import com.trkj.property.service.ParameterService;
import com.trkj.property.vo.AjaxResponse;
import com.trkj.property.vo.GetParsVO;
import com.trkj.property.vo.ParAndHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parameter")
public class ParameterController {

    @Autowired
    private ParameterService parameterService;

    /**
     * 添加台账信息
     * @param tParameter
     * @return
     */
    @PostMapping("add")
    public AjaxResponse addParameter(@RequestBody TParameter tParameter){

        System.out.println(tParameter.toString());


        Integer integer = parameterService.addParameter(tParameter);

        if (integer > 0){
            return AjaxResponse.success(integer);
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.USER_INPUT_ERROR,"输入异常"));
    }

    /**
     * 根据楼盘id查该楼盘下的所有台账信息
     * @param resId
     * @return
     */
    @GetMapping("byHouseId/{resId}")
    public AjaxResponse findAllParByResId(@PathVariable("resId") Integer resId){
        List<ParAndHouse> allParByResId = parameterService.findAllParByResId(resId);
        if (allParByResId != null){
            return AjaxResponse.success(allParByResId);
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.PAGE_NOT_FOUND_ERROR,"无法找到对应的资源"));
    }

    /**
     * 根据台账名称查询 该台账的所有台账详情列表
     */
    @GetMapping("getDetails/{parName}")
    public AjaxResponse findDetailsByParName(@PathVariable("parName") String parName){
        List<GetParsVO> detailsByParName = parameterService.findDetailsByParName(parName);
        if (detailsByParName != null){
            return AjaxResponse.success(detailsByParName);
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.PAGE_NOT_FOUND_ERROR,"台账详情列表打开失败"));
    }




}
