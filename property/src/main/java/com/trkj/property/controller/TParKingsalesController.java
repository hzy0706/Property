package com.trkj.property.controller;

import com.trkj.property.entity.TParkingsales;
import com.trkj.property.service.TParKingsalesService;
import com.trkj.property.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class TParKingsalesController {
    @Resource
    private TParKingsalesService tParKingsalesService;

    @GetMapping("/selectTParKingsales")
    public List<TParkingsales> selectTParKingsales(){
        log.debug("查看车位销售信息");
        return tParKingsalesService.selectTParKingsales();
    }
//    修改车位销售信息
    @PutMapping("/updateTParkingSales")
    public AjaxResponse updateTParkingSales(@RequestBody TParkingsales tParkingsales){
        tParKingsalesService.updateTParkingSales(tParkingsales);
        return AjaxResponse.success();
    }

    @PostMapping("/insertTParKing")
    public TParkingsales insertTParKing(@RequestBody @Valid TParkingsales tParkingsales){
        log.debug("添加成功");
        tParKingsalesService.insertTParKing(tParkingsales);
        return tParkingsales;
    }
    @GetMapping("/selectlicense/{value1}/{value2}")
    public List<TParkingsales> selectlicense(@PathVariable("value1")String value1,@PathVariable("value2")String value2){
        log.debug("查询成功");
        return tParKingsalesService.selectlicense(value1, value2);
    }

}
