package com.trkj.property.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.property.entity.TDecorate;
import com.trkj.property.service.TDecorateService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 8:35
 */
@RestController
public class TDecorateController {
    @Resource
    private TDecorateService tDecorateService;
    /**
     * 根据主键id删除装修记录
     * @author  胡志远
     * @param: 装修记录的主键id
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @DeleteMapping("/deleteByTDecorateKey/{id}")
    public AjaxResponse deleteByTDecorateKey(@PathVariable("id") Integer id){
        tDecorateService.deleteByTDecorateKey(id);
        return AjaxResponse.success();
    }
    /**
     * 新增装修记录
     * @author  胡志远
     * @param: 装修记录实体
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @PostMapping("/addTDecorate")
    public AjaxResponse addTDecorate(@RequestBody TDecorate tDecorate){
        tDecorateService.addTDecorate(tDecorate);
        return AjaxResponse.success();
    }
    /**
     * 根据主键id修改装修记录（传值为空的记录不修改）
     * @author  胡志远
     * @param: 装修记录实体
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @PutMapping("/updateByTDecorateKeySelective")
    public AjaxResponse updateByTDecorateKeySelective(@RequestBody TDecorate tDecorate){
        tDecorateService.updateByTDecorateKeySelective(tDecorate);
        return AjaxResponse.success();
    }
    /**
     * 根据主键id修改装修记录（除主键外全部都可以修改）
     * @author  胡志远
     * @param: 装修记录实体
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @PutMapping("/updateByTDecorateKey")
    public AjaxResponse updateByTDecorateKey(@RequestBody TDecorate tDecorate){
        tDecorateService.updateByTDecorateKey(tDecorate);
        return AjaxResponse.success();
    }
    /**
     * 根据装修状态和装修申请人、装修内容分页模糊查询装修记录
     * @author  胡志远
     * @param: 分页数据及查询条件
     * @return:
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTDecorateByState")
    public AjaxResponse selectAllTDecorateByState(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize
                                                    ,@RequestParam("state")Integer state, @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<TDecorate> list =new ArrayList<>();
        if(state==4){
            list = tDecorateService.selectAllTDecorates("%"+value+"%");
        }else{
            list = tDecorateService.selectAllTDecorateByState(state,"%"+value+"%");
        }
        PageInfo<TDecorate> pageInfo = new PageInfo<>(list);
        return AjaxResponse.success(pageInfo);
    }
}
