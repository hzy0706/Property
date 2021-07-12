package com.trkj.property.controller;

import com.trkj.property.entity.TParking;
import com.trkj.property.service.TParKingService;
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
    public TParking insertTRarKing(@RequestBody @Valid TParking tParking){
        log.debug("添加成功");
        tParKingService.insertTRarKing(tParking);
        return tParking;
    }

    @GetMapping("/selectstate/{value3}")
    public List<TParking> selectstate(@PathVariable("value3") String value3){
        log.debug("根据车位状态查询");
        return tParKingService.selectstate(value3);
    }


}
