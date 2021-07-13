package com.trkj.property.controller;

import com.trkj.property.entity.THouse;
import com.trkj.property.service.THouseService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 9:48
 */
@RestController
public class THouseController {
    @Resource
    private THouseService tHouseService;
    /**
     * 根据主键查询房间信息
     * @author  胡志远
     * @param:  房间主键
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectByTHouseKey")
    public AjaxResponse selectByTHouseKey(){
        THouse tHouse = tHouseService.selectByTHouseKey(1);
        return AjaxResponse.success(tHouse);
    }
    /**
     * 根据单元编号查询所有房间
     * @author  胡志远
     * @param: 单元编号
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTHouseByUid/{uid}")
    public AjaxResponse selectAllTHouseByUid(@PathVariable("uid") Integer uid){
        List<THouse> list = tHouseService.selectAllTHouseByUid(uid);
        return AjaxResponse.success(list);
    }
    /**
     * 根据单元编号和空闲状态查询所有房间
     * @author  胡志远
     * @param: 单元编号
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTHouseByUidAndState/{uid}")
    public AjaxResponse selectAllTHouseByUidAndState(@PathVariable("uid") Integer uid){
        List<THouse> list = tHouseService.selectAllTHouseByUidAndState(uid);
        return AjaxResponse.success(list);
    }
    /**
     * 根据主键修改房间信息
     * @author  胡志远
     * @param: 房间信息实体
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @PutMapping("/updateByTHouseKeySelective")
    public AjaxResponse updateByTHouseKeySelective(@RequestBody THouse tHouse){
        tHouseService.updateByTHouseKeySelective(tHouse);
        return AjaxResponse.success();
    }
}
