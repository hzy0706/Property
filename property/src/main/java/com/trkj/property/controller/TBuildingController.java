package com.trkj.property.controller;

import com.trkj.property.entity.TBuilding;
import com.trkj.property.service.TBuildingService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 10:22
 */
@RestController
public class TBuildingController {
    @Resource
    private TBuildingService tBuildingService;
    /**
     * 根据住宅编号查询楼宇信息
     * @author  胡志远
     * @param: 住宅编号
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTBuildingByRid/{rid}")
    public AjaxResponse selectAllTBuildingByRid(@PathVariable("rid") Integer rid){
        List<TBuilding> list = tBuildingService.selectAllTBuildingByRid(rid);
        return AjaxResponse.success(list);
    }
}
