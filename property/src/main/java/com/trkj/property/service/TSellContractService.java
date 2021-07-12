package com.trkj.property.service;

import com.trkj.property.entity.TSellContract;
import com.trkj.property.vo.form.TSellContractQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (TSellContract)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 15:15:46
 */
public interface TSellContractService {

    /**
     * 通过ID查询单条数据
     *
     * @param sellId 主键
     * @return 实例对象
     */
    TSellContract queryById(Integer sellId);

    /**
     * 查询所有数据
     *
     * @param tSellContractQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<TSellContract> queryAll(TSellContractQueryForm tSellContractQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param tSellContractQueryForm
     * @return 对象列表
     */
    PageInfo<TSellContract> queryBySearch(TSellContractQueryForm tSellContractQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param tSellContractQueryForm
     * @return 对象列表
     */
    PageInfo<TSellContract> queryByScreen(TSellContractQueryForm tSellContractQueryForm);

    /**
     * 新增数据
     *
     * @param tSellContract 实例对象
     * @return 实例对象
     */
    TSellContract insert(TSellContract tSellContract);

    /**
     * 批量新增数据
     *
     * @param TSellContractList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<TSellContract> TSellContractList);

    /**
     * 修改数据
     *
     * @param tSellContract 实例对象
     * @return 实例对象
     */
    TSellContract update(TSellContract tSellContract);

    /**
     * 批量修改数据
     *
     * @param tSellContractList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<TSellContract> tSellContractList);

    /**
     * 通过主键删除数据
     *
     * @param sellId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sellId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
