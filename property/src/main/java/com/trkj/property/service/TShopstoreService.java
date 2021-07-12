package com.trkj.property.service;

import com.trkj.property.entity.TShopstore;
import com.trkj.property.vo.form.TShopstoreQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (TShopstore)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 15:16:38
 */
public interface TShopstoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param stoId 主键
     * @return 实例对象
     */
    TShopstore queryById(Integer stoId);

    /**
     * 查询所有数据
     *
     * @param tShopstoreQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<TShopstore> queryAll(TShopstoreQueryForm tShopstoreQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param tShopstoreQueryForm
     * @return 对象列表
     */
    PageInfo<TShopstore> queryBySearch(TShopstoreQueryForm tShopstoreQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param tShopstoreQueryForm
     * @return 对象列表
     */
    PageInfo<TShopstore> queryByScreen(TShopstoreQueryForm tShopstoreQueryForm);

    /**
     * 新增数据
     *
     * @param tShopstore 实例对象
     * @return 实例对象
     */
    TShopstore insert(TShopstore tShopstore);

    /**
     * 批量新增数据
     *
     * @param TShopstoreList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<TShopstore> TShopstoreList);

    /**
     * 修改数据
     *
     * @param tShopstore 实例对象
     * @return 实例对象
     */
    TShopstore update(TShopstore tShopstore);

    /**
     * 批量修改数据
     *
     * @param tShopstoreList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<TShopstore> tShopstoreList);

    /**
     * 通过主键删除数据
     *
     * @param stoId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stoId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
