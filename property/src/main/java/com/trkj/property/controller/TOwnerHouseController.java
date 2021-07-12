package com.trkj.property.controller;

import com.trkj.property.entity.TOwnerHouse;
import com.trkj.property.service.TOwnerHouseService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 0:24
 */
@RestController
public class TOwnerHouseController {
    @Resource
    private TOwnerHouseService tOwnerHouseService;
    /**
     * 删除业主房产
     * @author  胡志远
     * @param:  业主房产主键id
     * @return:
     * @date  2021/7/11
     * @version 1.0
     */
    @DeleteMapping("/deleteByTOwnerHouseKey/{odId}")
    public AjaxResponse deleteByTOwnerHouseKey(@PathVariable("odId") Integer odId){
        tOwnerHouseService.deleteByTOwnerHouseKey(odId);
        return AjaxResponse.success();
    }
    /**
     * 添加业主房产信息
     * @author  胡志远
     * @param: 房产信息实体
     * @return:
     * @date  2021/7/11
     * @version 1.0
     */
    @PostMapping("/addTOwnerHouse")
    public AjaxResponse addTOwnerHouse(@RequestBody TOwnerHouse tOwnerHouse){
        tOwnerHouseService.addTOwnerHouse(tOwnerHouse);
        return AjaxResponse.success();
    }
    /**
     * 修改业主家庭房产信息
     * @author  胡志远
     * @param: 房产信息实体
     * @return:
     * @date  2021/7/11
     * @version 1.0
     */
    @PutMapping("/updateByTOwnerHouseKeySelective")
    public AjaxResponse updateByTOwnerHouseKeySelective(@RequestBody TOwnerHouse tOwnerHouse){
        tOwnerHouseService.updateByTOwnerHouseKeySelective(tOwnerHouse);
        return AjaxResponse.success();
    }
    /**
     * 根据业主id查询该业主所有房产信息
     * @author  胡志远
     * @param: 业主主键id
     * @return:
     * @date  2021/7/11
     * @version 1.0
     */
    @GetMapping("/selectAllTOwnerHouseByTid/{ownerId}")
    public AjaxResponse selectAllTOwnerHouseByTid(@PathVariable("ownerId") Integer ownerId){
        List<TOwnerHouse> list = tOwnerHouseService.selectAllTOwnerHouseByTid(ownerId);
        return AjaxResponse.success(list);
    }
}
