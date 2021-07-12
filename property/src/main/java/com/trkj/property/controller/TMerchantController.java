package com.trkj.property.controller;

import com.trkj.property.entity.TMerchant;
import com.trkj.property.vo.form.TMerchantQueryForm;
import com.trkj.property.service.TMerchantService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (TMerchant)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:55:15
 */
@RestController
public class TMerchantController {
    /**
     * 服务对象
     */
    @Resource
    private TMerchantService tMerchantService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tMerchant/one")
    public TMerchant selectOne(Integer id) {
        return this.tMerchantService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param tMerchantQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/tMerchant")
    public PageInfo<TMerchant> queryAll(TMerchantQueryForm tMerchantQueryForm) {

        return this.tMerchantService.queryAll(tMerchantQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tMerchantQueryForm
     * @return 对象列表
     */
    @GetMapping("/tMerchant/search")
    public PageInfo<TMerchant> queryBySearch(TMerchantQueryForm tMerchantQueryForm) {

        return this.tMerchantService.queryBySearch(tMerchantQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tMerchantQueryForm
     * @return 对象列表
     */
    @GetMapping("/tMerchant/screen")
    public PageInfo<TMerchant> queryByScreen(TMerchantQueryForm tMerchantQueryForm) {

        return this.tMerchantService.queryByScreen(tMerchantQueryForm);
    }

    /**
     * 新增数据
     *
     * @param tMerchant 实例对象
     * @return 实例对象
     */
    @PostMapping("/tMerchant")
    public TMerchant insert(@RequestBody TMerchant tMerchant) {

        return this.tMerchantService.insert(tMerchant);
    }

    /**
     * 批量新增数据
     *
     * @param TMerchantList 实例对象列表
     * @return 影响行数
     */
    @PostMapping("/tMerchant/batch")
    public boolean insertBatch(@RequestBody List<TMerchant> TMerchantList) {
        return this.tMerchantService.insertBatch(TMerchantList);
    }

    /**
     * 修改数据
     *
     * @param tMerchant 实例对象
     * @return 实例对象
     */
    @PutMapping("/tMerchant")
    public TMerchant update(@RequestBody TMerchant tMerchant) {
        return this.tMerchantService.update(tMerchant);
    }

    /**
     * 批量修改数据
     *
     * @param tMerchantList 实例对象列表
     * @return 影响行数
     */
    @PutMapping("/tMerchant/batch")
    public boolean updateBatch(@RequestBody List<TMerchant> tMerchantList) {
        return this.tMerchantService.updateBatch(tMerchantList);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/tMerchant")
    public boolean deleteById(Integer id) {
        return this.tMerchantService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/tMerchant/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.tMerchantService.deleteBatch(ids);
    }
}
