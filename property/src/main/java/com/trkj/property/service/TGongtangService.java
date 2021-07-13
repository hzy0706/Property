package com.trkj.property.service;

import com.trkj.property.entity.TGongtang;
import com.trkj.property.vo.form.TGongtangQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (TGongtang)表服务接口
 *
 * @author makejava
 * @since 2021-07-14 05:50:50
 */
public interface TGongtangService {

    /**
     * 通过ID查询单条数据
     *
     * @param gId 主键
     * @return 实例对象
     */
    TGongtang queryById(Integer gId);

    /**
     * 查询所有数据
     *
     * @param tGongtangQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<TGongtang> queryAll(TGongtangQueryForm tGongtangQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param tGongtangQueryForm
     * @return 对象列表
     */
    PageInfo<TGongtang> queryBySearch(TGongtangQueryForm tGongtangQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param tGongtangQueryForm
     * @return 对象列表
     */
    PageInfo<TGongtang> queryByScreen(TGongtangQueryForm tGongtangQueryForm);

    /**
     * 新增数据
     *
     * @param tGongtang 实例对象
     * @return 实例对象
     */
    TGongtang insert(TGongtang tGongtang);

    /**
     * 批量新增数据
     *
     * @param TGongtangList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<TGongtang> TGongtangList);

    /**
     * 修改数据
     *
     * @param tGongtang 实例对象
     * @return 实例对象
     */
    TGongtang update(TGongtang tGongtang);

    /**
     * 批量修改数据
     *
     * @param tGongtangList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<TGongtang> tGongtangList);

    /**
     * 通过主键删除数据
     *
     * @param gId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer gId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
