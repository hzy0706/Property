package com.trkj.property.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.property.entity.TInspectionroom;
import com.trkj.property.service.TInspectionroomService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 11:12
 */
@RestController
public class TInspectionroomController {
    @Resource
    private TInspectionroomService tInspectionroomService;

    /**
     * 添加验房信息
     * @author  胡志远
     * @param: 验房详细实体
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @PostMapping("/addTInspectionroom")
    public AjaxResponse addTInspectionroom(@RequestBody TInspectionroom tInspectionroom){
        tInspectionroomService.addTInspectionroom(tInspectionroom);
        return AjaxResponse.success();
    }
    /**
     *根据房产名分页模糊查询验房信息
     * @author  胡志远
     * @param: 分页数据及房产名
     * @return: 
     * @date  2021/7/12
     * @version 1.0
     */
    @GetMapping("/selectAllTInspectionroomByRoomName")
    public AjaxResponse selectAllTInspectionroomByRoomName(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize
                                                            , @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<TInspectionroom> list = tInspectionroomService.selectAllTInspectionroomByRoomName("%"+value+"%");
        PageInfo<TInspectionroom> pageInfo = new PageInfo<>(list);
        return AjaxResponse.success(pageInfo);
    }
}
