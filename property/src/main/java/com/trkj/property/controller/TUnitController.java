package com.trkj.property.controller;

import com.trkj.property.entity.TUnit;
import com.trkj.property.service.TUnitService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 10:02
 */
@RestController
public class TUnitController {
    @Resource
    private TUnitService tUnitService;
    /**
     * 根据楼宇编号查询单元信息
     * @author  胡志远
     * @param: 楼宇编号
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTUnitByBid/{bid}")
    public AjaxResponse selectAllTUnitByBid(@PathVariable("bid") Integer bid){
        List<TUnit> list = tUnitService.selectAllTUnitByBid(bid);
        return AjaxResponse.success(list);
    }
}
