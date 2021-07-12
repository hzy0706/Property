package com.trkj.property.controller;

import com.trkj.property.entity.TSellContract;
import com.trkj.property.vo.form.TSellContractQueryForm;
import com.trkj.property.service.TSellContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (TSellContract)表控制层
 *
 * @author makejava
 * @since 2021-07-12 15:15:47
 */
@RestController
public class TSellContractController {
    /**
     * 服务对象
     */
    @Resource
    private TSellContractService tSellContractService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tSellContract/one")
    public TSellContract selectOne(Integer id) {
        return this.tSellContractService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param tSellContractQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/tSellContract")
    public PageInfo<TSellContract> queryAll(TSellContractQueryForm tSellContractQueryForm) {

        return this.tSellContractService.queryAll(tSellContractQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tSellContractQueryForm
     * @return 对象列表
     */
    @GetMapping("/tSellContract/search")
    public PageInfo<TSellContract> queryBySearch(TSellContractQueryForm tSellContractQueryForm) {

        return this.tSellContractService.queryBySearch(tSellContractQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tSellContractQueryForm
     * @return 对象列表
     */
    @GetMapping("/tSellContract/screen")
    public PageInfo<TSellContract> queryByScreen(TSellContractQueryForm tSellContractQueryForm) {

        return this.tSellContractService.queryByScreen(tSellContractQueryForm);
    }

    /**
     * 新增数据
     *
     * @param tSellContract 实例对象
     * @return 实例对象
     */
    @PostMapping("/tSellContract")
    public TSellContract insert(@RequestBody TSellContract tSellContract) {

        return this.tSellContractService.insert(tSellContract);
    }

    /**
     * 批量新增数据
     *
     * @param TSellContractList 实例对象列表
     * @return 影响行数
     */
    @PostMapping("/tSellContract/batch")
    public boolean insertBatch(@RequestBody List<TSellContract> TSellContractList) {
        return this.tSellContractService.insertBatch(TSellContractList);
    }

    /**
     * 修改数据
     *
     * @param tSellContract 实例对象
     * @return 实例对象
     */
    @PutMapping("/tSellContract")
    public TSellContract update(@RequestBody TSellContract tSellContract) {
        return this.tSellContractService.update(tSellContract);
    }

    /**
     * 批量修改数据
     *
     * @param tSellContractList 实例对象列表
     * @return 影响行数
     */
    @PutMapping("/tSellContract/batch")
    public boolean updateBatch(@RequestBody List<TSellContract> tSellContractList) {
        return this.tSellContractService.updateBatch(tSellContractList);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/tSellContract")
    public boolean deleteById(Integer id) {
        return this.tSellContractService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/tSellContract/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.tSellContractService.deleteBatch(ids);
    }
}
