package com.trkj.property.controller;

import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;
import com.trkj.property.service.TCostitemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (TCostitem)表控制层
 *
 * @author makejava
 * @since 2021-07-13 12:05:01
 */
@RestController
public class TCostitemController {
    /**
     * 服务对象
     */
    @Resource
    private TCostitemService tCostitemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tCostitem/one")
    public TCostitem selectOne(Integer id) {
        return this.tCostitemService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param tCostitemQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/tCostitem")
    public PageInfo<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm) {

        return this.tCostitemService.queryAll(tCostitemQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tCostitemQueryForm
     * @return 对象列表
     */
    @GetMapping("/tCostitem/search")
    public PageInfo<TCostitem> queryBySearch(TCostitemQueryForm tCostitemQueryForm) {

        return this.tCostitemService.queryBySearch(tCostitemQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tCostitemQueryForm
     * @return 对象列表
     */
    @GetMapping("/tCostitem/screen")
    public PageInfo<TCostitem> queryByScreen(TCostitemQueryForm tCostitemQueryForm) {

        return this.tCostitemService.queryByScreen(tCostitemQueryForm);
    }

    /**
     * 新增数据
     *
     * @param tCostitem 实例对象
     * @return 实例对象
     */
    @PostMapping("/tCostitem")
    public TCostitem insert(@RequestBody TCostitem tCostitem) {

        return this.tCostitemService.insert(tCostitem);
    }



    /**
     * 修改数据
     *
     * @param tCostitem 实例对象
     * @return 实例对象
     */
    @PutMapping("/tCostitem")
    public TCostitem update(@RequestBody TCostitem tCostitem) {
        return this.tCostitemService.update(tCostitem);
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/tCostitem")
    public boolean deleteById(Integer id) {
        return this.tCostitemService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/tCostitem/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.tCostitemService.deleteBatch(ids);
    }
}
