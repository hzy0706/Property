package com.trkj.property.controller;

import com.trkj.property.entity.TShopstore;
import com.trkj.property.vo.form.TShopstoreQueryForm;
import com.trkj.property.service.TShopstoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (TShopstore)表控制层
 *
 * @author makejava
 * @since 2021-07-12 15:16:39
 */
@RestController
public class TShopstoreController {
    /**
     * 服务对象
     */
    @Resource
    private TShopstoreService tShopstoreService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/tShopstore/one")
    public TShopstore selectOne(Integer id) {
        return this.tShopstoreService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @param tShopstoreQueryForm 实例对象
     * @return 实例对象
     */
    @GetMapping("/tShopstore")
    public PageInfo<TShopstore> queryAll(TShopstoreQueryForm tShopstoreQueryForm) {

        return this.tShopstoreService.queryAll(tShopstoreQueryForm);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tShopstoreQueryForm
     * @return 对象列表
     */
    @GetMapping("/tShopstore/search")
    public PageInfo<TShopstore> queryBySearch(TShopstoreQueryForm tShopstoreQueryForm) {

        return this.tShopstoreService.queryBySearch(tShopstoreQueryForm);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tShopstoreQueryForm
     * @return 对象列表
     */
    @GetMapping("/tShopstore/screen")
    public PageInfo<TShopstore> queryByScreen(TShopstoreQueryForm tShopstoreQueryForm) {

        return this.tShopstoreService.queryByScreen(tShopstoreQueryForm);
    }

    /**
     * 新增数据
     *
     * @param tShopstore 实例对象
     * @return 实例对象
     */
    @PostMapping("/tShopstore")
    public TShopstore insert(@RequestBody TShopstore tShopstore) {

        return this.tShopstoreService.insert(tShopstore);
    }

    /**
     * 批量新增数据
     *
     * @param TShopstoreList 实例对象列表
     * @return 影响行数
     */
    @PostMapping("/tShopstore/batch")
    public boolean insertBatch(@RequestBody List<TShopstore> TShopstoreList) {
        return this.tShopstoreService.insertBatch(TShopstoreList);
    }

    /**
     * 修改数据
     *
     * @param tShopstore 实例对象
     * @return 实例对象
     */
    @PutMapping("/tShopstore")
    public TShopstore update(@RequestBody TShopstore tShopstore) {
        return this.tShopstoreService.update(tShopstore);
    }

    /**
     * 批量修改数据
     *
     * @param tShopstoreList 实例对象列表
     * @return 影响行数
     */
    @PutMapping("/tShopstore/batch")
    public boolean updateBatch(@RequestBody List<TShopstore> tShopstoreList) {
        return this.tShopstoreService.updateBatch(tShopstoreList);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("/tShopstore")
    public boolean deleteById(Integer id) {
        return this.tShopstoreService.deleteById(id);
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    @DeleteMapping("/tShopstore/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids) {
        return this.tShopstoreService.deleteBatch(ids);
    }
}
