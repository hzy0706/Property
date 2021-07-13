package com.trkj.property.service;

import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (TCostitem)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 12:04:58
 */
public interface TCostitemService {

    /**
     * 通过ID查询单条数据
     *
     * @param ctId 主键
     * @return 实例对象
     */
    TCostitem queryById(Integer ctId);

    /**
     * 查询所有数据
     *
     * @param tCostitemQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param tCostitemQueryForm
     * @return 对象列表
     */
    PageInfo<TCostitem> queryBySearch(TCostitemQueryForm tCostitemQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param tCostitemQueryForm
     * @return 对象列表
     */
    PageInfo<TCostitem> queryByScreen(TCostitemQueryForm tCostitemQueryForm);

    /**
     * 新增数据
     *
     * @param tCostitem 实例对象
     * @return 实例对象
     */
    TCostitem insert(TCostitem tCostitem);

    /**
     * 批量新增数据
     *
     * @param TCostitemList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<TCostitem> TCostitemList);

    /**
     * 修改数据
     *
     * @param tCostitem 实例对象
     * @return 实例对象
     */
    TCostitem update(TCostitem tCostitem);

    /**
     * 批量修改数据
     *
     * @param tCostitemList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<TCostitem> tCostitemList);

    /**
     * 通过主键删除数据
     *
     * @param ctId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ctId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
