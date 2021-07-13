package com.trkj.property.controller;

import com.trkj.property.entity.TBill;
import com.trkj.property.exception.CustomError;
import com.trkj.property.exception.CustomErrorType;
import com.trkj.property.service.BillService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bill")
public class BIllController {


    @Autowired
    private BillService billService;


    /**
     * 新增账单
     * @param tBill
     * @return
     */
    @PostMapping("addBill")
    public AjaxResponse addBill(@RequestBody TBill tBill){
        Integer result = billService.addBill(tBill);
        if (result > 0){
            return AjaxResponse.success();
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.SYSTEM_ERROR,"系统异常，等开发人员抢救过来再说"));
    }



}
