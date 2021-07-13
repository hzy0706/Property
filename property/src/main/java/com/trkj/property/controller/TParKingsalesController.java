package com.trkj.property.controller;

import com.trkj.property.entity.TParkingsales;
import com.trkj.property.service.TParKingsalesService;
import com.trkj.property.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
}
