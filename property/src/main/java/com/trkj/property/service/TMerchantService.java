package com.trkj.property.service;

import com.trkj.property.entity.TMerchant;
import com.trkj.property.vo.form.TMerchantQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (TMerchant)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:55:15
 */
public interface TMerchantService {

    /**
     * 通过ID查询单条数据
     *
     * @param merId 主键
     * @return 实例对象
     */
    TMerchant queryById(Integer merId);

    /**
     * 查询所有数据
     *
     * @param tMerchantQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<TMerchant> queryAll(TMerchantQueryForm tMerchantQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param tMerchantQueryForm
     * @return 对象列表
     */
    PageInfo<TMerchant> queryBySearch(TMerchantQueryForm tMerchantQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param tMerchantQueryForm
     * @return 对象列表
     */
    PageInfo<TMerchant> queryByScreen(TMerchantQueryForm tMerchantQueryForm);

    /**
     * 新增数据
     *
     * @param tMerchant 实例对象
     * @return 实例对象
     */
    TMerchant insert(TMerchant tMerchant);

    /**
     * 批量新增数据
     *
     * @param TMerchantList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<TMerchant> TMerchantList);

    /**
     * 修改数据
     *
     * @param tMerchant 实例对象
     * @return 实例对象
     */
    TMerchant update(TMerchant tMerchant);

    /**
     * 批量修改数据
     *
     * @param tMerchantList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<TMerchant> tMerchantList);

    /**
     * 通过主键删除数据
     *
     * @param merId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer merId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
