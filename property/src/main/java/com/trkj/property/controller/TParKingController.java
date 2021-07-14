package com.trkj.property.controller;

import com.trkj.property.entity.TParking;
import com.trkj.property.entity.TParkingsales;
import com.trkj.property.service.TParKingService;
import com.trkj.property.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class TParKingController {
    @Resource
    private TParKingService tParKingService;

    @GetMapping("/selectTParKing")
    public List<TParking> selectTPking(){
        log.debug("查看车位信息");
        return tParKingService.selectTParKing();
    }

    @PostMapping("/insertTRarKing")
    public TParking insertTRarKing(@RequestBody TParking tParking){
        System.out.println(tParking.toString());
        log.debug("添加成功");
        tParKingService.insertTRarKing(tParking);
        return tParking;
    }

    @GetMapping("/selectstate/{value3}/{value2}")
    public List<TParking> selectstate(@PathVariable("value3")String value3,@PathVariable("value2")String value2){
        log.debug("根据车位状态查询");
        System.out.println(value3+"--------------"+value2);
        return tParKingService.selectstate(value3,"%"+value2+"%");
    }
//修改
    @PutMapping("/updateTParKing")
    public AjaxResponse updateTParKing(@RequestBody TParking tParking){
        tParKingService.updateTParKing(tParking);
        return AjaxResponse.success();
    }

    @GetMapping("/selectmanagemen")
    public List<TParkingsales> selectmanagemen(){
        log.debug("查询管理类别为出售的");
        return tParKingService.selectmanagemen();
    }
//修改状态
    @PutMapping("/updateState")
    public AjaxResponse updateState(@RequestBody TParking tParking){
        tParKingService.updateTParKing(tParking);
        return AjaxResponse.success();
    }


}
