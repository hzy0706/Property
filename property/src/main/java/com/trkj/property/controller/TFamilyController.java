package com.trkj.property.controller;

import com.trkj.property.entity.TFamily;
import com.trkj.property.service.TFamilyService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/11 21:54
 */
@RestController
public class TFamilyController {
    @Resource
    private TFamilyService tFamilyService;
    /**
     * 删除业主家庭成员
     * @author  胡志远
     * @param:  业主家庭成员主键id
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @DeleteMapping("/deleteByTFamilyKey")
    public AjaxResponse deleteByTFamilyKey(){
        tFamilyService.deleteByTFamilyKey(1);
        return AjaxResponse.success();
    }
    /**
     * 添加业主家庭成员
     * @author  胡志远
     * @param: 家庭成员信息实体
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @PostMapping("/addTFamily")
    public AjaxResponse addTFamily(@RequestBody TFamily tFamily){
        tFamilyService.addTFamily(tFamily);
        return AjaxResponse.success();
    }
    /**
     * 修改业主家庭成员信息
     * @author  胡志远
     * @param: 家庭成员信息实体
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @PutMapping("/updateByTFamilyKeySelective")
    public AjaxResponse updateByTFamilyKeySelective(@RequestBody TFamily tFamily){
        tFamilyService.updateByTFamilyKeySelective(tFamily);
        return AjaxResponse.success();
    }
    /**
     * 根据业主id查询该业主所有家庭成员信息
     * @author  胡志远
     * @param: 业主主键id
     * @return: 
     * @date  2021/7/11
     * @version 1.0
     */
    @GetMapping("/selectAllTFamilyByTid/{ownerId}")
    public AjaxResponse selectAllTFamilyByTid(@PathVariable("ownerId") Integer ownerId){
        List<TFamily> list = tFamilyService.selectAllTFamilyByTid(ownerId);
        return AjaxResponse.success();
    }
    
}
