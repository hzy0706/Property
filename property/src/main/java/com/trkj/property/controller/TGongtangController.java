package com.trkj.property.controller;

import com.trkj.property.entity.TGongtang;
import com.trkj.property.vo.form.TGongtangQueryForm;
import com.trkj.property.service.TGongtangService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (TGongtang)表控制层
 *
 * @author makejava
 * @since 2021-07-14 05:50:51
 */
@RestController
public class TGongtangController {
    /**
     * 服务对象
     */
    @Resource
    private TGongtangService tGongtangService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tGongtang/one")
    public TGongtang selectOne(Integer id) {
        return this.tGongtangService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param tGongtangQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/tGongtang")
    public PageInfo<TGongtang> queryAll(TGongtangQueryForm tGongtangQueryForm) {

        return this.tGongtangService.queryAll(tGongtangQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tGongtangQueryForm
     * @return 对象列表
     */
    @GetMapping("/tGongtang/search")
    public PageInfo<TGongtang> queryBySearch(TGongtangQueryForm tGongtangQueryForm) {

        return this.tGongtangService.queryBySearch(tGongtangQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tGongtangQueryForm
     * @return 对象列表
     */
    @GetMapping("/tGongtang/screen")
    public PageInfo<TGongtang> queryByScreen(TGongtangQueryForm tGongtangQueryForm) {

        return this.tGongtangService.queryByScreen(tGongtangQueryForm);
    }

    /**
     * 新增数据
     *
     * @param tGongtang 实例对象
     * @return 实例对象
     */
    @PostMapping("/tGongtang")
    public TGongtang insert(@RequestBody TGongtang tGongtang) {

        return this.tGongtangService.insert(tGongtang);
    }

    /**
     * 批量新增数据
     *
     * @param TGongtangList 实例对象列表
     * @return 影响行数
     */
    @PostMapping("/tGongtang/batch")
    public boolean insertBatch(@RequestBody List<TGongtang> TGongtangList) {
        return this.tGongtangService.insertBatch(TGongtangList);
    }

    /**
     * 修改数据
     *
     * @param tGongtang 实例对象
     * @return 实例对象
     */
    @PutMapping("/tGongtang")
    public TGongtang update(@RequestBody TGongtang tGongtang) {
        return this.tGongtangService.update(tGongtang);
    }

    /**
     * 批量修改数据
     *
     * @param tGongtangList 实例对象列表
     * @return 影响行数
     */
    @PutMapping("/tGongtang/batch")
    public boolean updateBatch(@RequestBody List<TGongtang> tGongtangList) {
        return this.tGongtangService.updateBatch(tGongtangList);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/tGongtang")
    public boolean deleteById(Integer id) {
        return this.tGongtangService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/tGongtang/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.tGongtangService.deleteBatch(ids);
    }
}
