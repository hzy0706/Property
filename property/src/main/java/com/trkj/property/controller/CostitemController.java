package com.trkj.property.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.service.TCostitemService;
import com.trkj.property.vo.form.TCostitemQueryForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CostitemController {

    @Resource
    private TCostitemService tCostitemService;

    @GetMapping("/Costitem")
    public PageInfo<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm){
        tCostitemQueryForm.setCtId(1);
        return this.tCostitemService.queryAll(tCostitemQueryForm);
    }
}
