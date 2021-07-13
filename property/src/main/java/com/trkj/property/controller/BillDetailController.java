package com.trkj.property.controller;

import com.trkj.property.entity.TBillDetail;
import com.trkj.property.exception.CustomError;
import com.trkj.property.exception.CustomErrorType;
import com.trkj.property.service.BillDetailService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("billDetail")
public class BillDetailController {

    @Autowired
    private BillDetailService billDetailService;

    @PostMapping("add")
    public AjaxResponse addBillDeatil(@RequestBody TBillDetail tBillDetail){
        Integer integer = billDetailService.addBillDetail(tBillDetail);
        if (integer > 0){
            return AjaxResponse.success();
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.SYSTEM_ERROR,""));
    }

    @GetMapping("allBillDetail")
    public AjaxResponse findAll(){
        List<TBillDetail> allDetail = billDetailService.findAllDetail();
        if (allDetail != null){
            return AjaxResponse.success(allDetail);
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.SYSTEM_ERROR,""));
    }
    @GetMapping("billDetailByHouseId/{houseId}")
    public AjaxResponse findByHouseId(@PathVariable("houseId") Integer houseId){
        List<TBillDetail> billDetailByHouseId = billDetailService.findBillDetailByHouseId(houseId);
        if (billDetailByHouseId != null){
            return AjaxResponse.success(billDetailByHouseId);
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.PAGE_NOT_FOUND_ERROR,""));

    }
}
