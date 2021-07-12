package com.trkj.property.controller;

import com.trkj.property.entity.TLeasingContract;
import com.trkj.property.vo.form.TLeasingContractQueryForm;
import com.trkj.property.service.TLeasingContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (TLeasingContract)表控制层
 *
 * @author makejava
 * @since 2021-07-12 15:14:46
 */
@RestController
public class TLeasingContractController {
    /**
     * 服务对象
     */
    @Resource
    private TLeasingContractService tLeasingContractService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tLeasingContract/one")
    public TLeasingContract selectOne(Integer id) {
        return this.tLeasingContractService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param tLeasingContractQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/tLeasingContract")
    public PageInfo<TLeasingContract> queryAll(TLeasingContractQueryForm tLeasingContractQueryForm) {

        return this.tLeasingContractService.queryAll(tLeasingContractQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tLeasingContractQueryForm
     * @return 对象列表
     */
    @GetMapping("/tLeasingContract/search")
    public PageInfo<TLeasingContract> queryBySearch(TLeasingContractQueryForm tLeasingContractQueryForm) {

        return this.tLeasingContractService.queryBySearch(tLeasingContractQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tLeasingContractQueryForm
     * @return 对象列表
     */
    @GetMapping("/tLeasingContract/screen")
    public PageInfo<TLeasingContract> queryByScreen(TLeasingContractQueryForm tLeasingContractQueryForm) {

        return this.tLeasingContractService.queryByScreen(tLeasingContractQueryForm);
    }

    /**
     * 新增数据
     *
     * @param tLeasingContract 实例对象
     * @return 实例对象
     */
    @PostMapping("/tLeasingContract")
    public TLeasingContract insert(@RequestBody TLeasingContract tLeasingContract) {

        return this.tLeasingContractService.insert(tLeasingContract);
    }

    /**
     * 批量新增数据
     *
     * @param TLeasingContractList 实例对象列表
     * @return 影响行数
     */
    @PostMapping("/tLeasingContract/batch")
    public boolean insertBatch(@RequestBody List<TLeasingContract> TLeasingContractList) {
        return this.tLeasingContractService.insertBatch(TLeasingContractList);
    }

    /**
     * 修改数据
     *
     * @param tLeasingContract 实例对象
     * @return 实例对象
     */
    @PutMapping("/tLeasingContract")
    public TLeasingContract update(@RequestBody TLeasingContract tLeasingContract) {
        return this.tLeasingContractService.update(tLeasingContract);
    }

    /**
     * 批量修改数据
     *
     * @param tLeasingContractList 实例对象列表
     * @return 影响行数
     */
    @PutMapping("/tLeasingContract/batch")
    public boolean updateBatch(@RequestBody List<TLeasingContract> tLeasingContractList) {
        return this.tLeasingContractService.updateBatch(tLeasingContractList);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/tLeasingContract")
    public boolean deleteById(Integer id) {
        return this.tLeasingContractService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/tLeasingContract/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.tLeasingContractService.deleteBatch(ids);
    }
}
