package com.trkj.property.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.property.entity.TDecorate;
import com.trkj.property.entity.TMaintain;
import com.trkj.property.service.TMaintainService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 9:21
 */
@RestController
public class TMaintainController {
    @Resource
    private TMaintainService tMaintainService;
    /**
     * 根据主键id删除请修记录
     * @author  胡志远
     * @param: 请修记录的主键id
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @DeleteMapping("/deleteByTMaintainKey")
    public AjaxResponse deleteByTMaintainKey(){
        tMaintainService.deleteByTMaintainKey(1);
        return AjaxResponse.success();
    }
    /**
     * 新增请修记录
     * @author  胡志远
     * @param: 请修记录实体
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @PostMapping("/addTMaintain")
    public AjaxResponse addTMaintain(@RequestBody TMaintain tMaintain){
        tMaintainService.addTMaintain(tMaintain);
        return AjaxResponse.success();
    }
    /**
     * 根据主键id修改请修记录（传值为空的记录不修改）
     * @author  胡志远
     * @param: 请修记录实体
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @PutMapping("/updateByTMaintainKeySelective")
    public AjaxResponse updateByTMaintainKeySelective(@RequestBody TMaintain tMaintain){
        tMaintainService.updateByTMaintainKeySelective(tMaintain);
        return AjaxResponse.success();
    }
    /**
     * 根据主键id修改请修记录（除主键外全部都可以修改）
     * @author  胡志远
     * @param: 请修记录实体
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @PutMapping("/updateByTMaintainKey")
    public AjaxResponse updateByTMaintainKey(@RequestBody TMaintain tMaintain){
        tMaintainService.updateByTMaintainKey(tMaintain);
        return AjaxResponse.success();
    }

    /**
     * 根据请修状态和请修人、请修内容分页模糊查询请修记录
     * @author  胡志远
     * @param: 分页数据及查询条件
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTMaintainByState")
    public AjaxResponse selectAllTMaintainByState(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize
            ,@RequestParam("state")Integer state, @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<TMaintain> list = tMaintainService.selectAllTMaintainByState(state,"%"+value+"%");
        PageInfo<TMaintain> pageInfo = new PageInfo<>(list);
        return AjaxResponse.success(pageInfo);
    }
}
