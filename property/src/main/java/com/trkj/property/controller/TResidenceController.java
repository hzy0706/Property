package com.trkj.property.controller;

import com.trkj.property.entity.TResidence;
import com.trkj.property.exception.CustomError;
import com.trkj.property.exception.CustomErrorType;
import com.trkj.property.service.TResidenceService;
import com.trkj.property.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡志远
 * @version 1.0
 * @date 2021/7/12 19:42
 */
@RestController
public class TResidenceController {
    @Resource
    private TResidenceService tResidenceService;
    @GetMapping("/selectAllTResidence")
    public AjaxResponse selectAllTResidence(){
        List<TResidence> list = tResidenceService.selectAllTResidence();
        return AjaxResponse.success(list);
    }

    @GetMapping("/findByIdRes/{resId}")
    public AjaxResponse selectByPrimaryKey(@PathVariable("resId") Integer resId){
        TResidence tResidence = tResidenceService.selectByPrimaryKey(resId);
        if (tResidence!= null){
            return AjaxResponse.success(tResidence);
        }
        return AjaxResponse.error(new CustomError(CustomErrorType.PAGE_NOT_FOUND_ERROR,"查不到啊"));
    }

    /**
     * 通过主键查询单条数据
     *通过住宅id查询楼盘
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tResidence/one")
    public TResidence selectOne(Integer id) {
        return this.tResidenceService.queryById(id);
    }


}
