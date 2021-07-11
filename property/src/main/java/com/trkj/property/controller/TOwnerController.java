package com.trkj.property.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.property.entity.TOwner;
import com.trkj.property.service.TOwnerService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/11 19:26
 */
@RestController
public class TOwnerController {
    @Resource
    private TOwnerService tOwnerService;

    /**
     * 根据主键删除业主
     * @author  胡志远
     * @param: 业主主键集合
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @DeleteMapping("/deleteByTOwnerKey")
    public AjaxResponse deleteByTOwnerKey(){
        tOwnerService.deleteByTOwnerKey(1);
        return  AjaxResponse.success();
    }

    /**
     * 新增业主
     * @author  胡志远
     * @param:  业主实体
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @PostMapping("/addTOwner")
    public AjaxResponse addTOwner(@RequestBody TOwner tOwner){
        tOwnerService.addTOwner(tOwner);
        return AjaxResponse.success();
    }
    /**
     * 修改业主信息
     * @author  胡志远
     * @param: 业主实体
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @PutMapping("/updateTOwner")
    public AjaxResponse updateTOwner(@RequestBody TOwner tOwner){
        tOwnerService.updateByTOwnerKeySelective(tOwner);
        return AjaxResponse.success();
    }
    /**
     * 根据业主姓名及紧急联系人模糊查询业主信息（分页显示）
     * @author  胡志远
     * @param:  分页数据及查询条件
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @GetMapping("/selectAllTOwners")
    public AjaxResponse selectAllTOwners(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize
                                            , @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<TOwner> list = tOwnerService.selectAllTOwners("%"+value+"%");
        PageInfo<TOwner> pageInfo = new PageInfo<>(list);
        return AjaxResponse.success(pageInfo);
    }
}
