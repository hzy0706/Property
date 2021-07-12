package com.trkj.property.controller;

import com.trkj.property.entity.TResidence;
import com.trkj.property.service.TResidenceService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 19:42
 */
@RestController
public class TResidenceController {
    @Resource
    private TResidenceService tResidenceService;
    @GetMapping("/selectAllTResidence")
    public AjaxResponse selectAllTResidence(){
        List<TResidence> list = tResidenceService.selectAllTResidence();
        return AjaxResponse.success(list);
    }
}
