package com.trkj.property.controller;

import com.trkj.property.entity.TInspectionroominfo;
import com.trkj.property.service.TInspectionroominfoService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 11:25
 */
@RestController
public class TInspectionroominfoController {
    @Resource
    private TInspectionroominfoService tInspectionroominfoService;
    /**
     * 根据验房详细编号删除验房详细信息
     * @author  胡志远
     * @param: 验房详细编号
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @DeleteMapping("/deleteByTInspectionroominfoKey")
    public AjaxResponse deleteByTInspectionroominfoKey(){
        tInspectionroominfoService.deleteByTInspectionroominfoKey(1);
        return AjaxResponse.success();
    }
    /**
     * 添加验房详细信息
     * @author  胡志远
     * @param: 验房详细实体
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @PostMapping("/addTInspectionroominfo")
    public AjaxResponse addTInspectionroominfo(@RequestBody TInspectionroominfo tInspectionroominfo){
        tInspectionroominfoService.addTInspectionroominfo(tInspectionroominfo);
        return AjaxResponse.success();
    }
    /**
     * 根据验房id查询验房详细信息
     * @author  胡志远
     * @param: 验房主键id
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTInspectionroominfoByIrid/{irid}")
    public AjaxResponse selectAllTInspectionroominfoByIrid(@PathVariable("irid")Integer irid){
        List<TInspectionroominfo> list = tInspectionroominfoService.selectAllTInspectionroominfoByIrid(irid);
        return AjaxResponse.success(list);
    }
    /**
     * 根据验房详细id修改验房详细信息
     * @author  胡志远
     * @param: 验房详细实体
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @PutMapping("/updateByTInspectionroominfoKeySelective")
    public AjaxResponse updateByTInspectionroominfoKeySelective(@RequestBody TInspectionroominfo tInspectionroominfo){
        tInspectionroominfoService.updateByTInspectionroominfoKeySelective(tInspectionroominfo);
        return AjaxResponse.success();
    }
}
