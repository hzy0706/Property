package com.trkj.property.service;

import com.trkj.property.entity.TLeasingContract;
import com.trkj.property.vo.form.TLeasingContractQueryForm;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * (TLeasingContract)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 15:14:45
 */
public interface TLeasingContractService {

    /**
     * 通过ID查询单条数据
     *
     * @param leaseId 主键
     * @return 实例对象
     */
    TLeasingContract queryById(Integer leaseId);

    /**
     * 查询所有数据
     *
     * @param tLeasingContractQueryForm 实例对象
     * @return 实例对象
     */
    PageInfo<TLeasingContract> queryAll(TLeasingContractQueryForm tLeasingContractQueryForm);

    /**
     * 根据查询条件搜索数据
     *
     * @param tLeasingContractQueryForm
     * @return 对象列表
     */
    PageInfo<TLeasingContract> queryBySearch(TLeasingContractQueryForm tLeasingContractQueryForm);

    /**
     * 根据查询条件筛选数据
     *
     * @param tLeasingContractQueryForm
     * @return 对象列表
     */
    PageInfo<TLeasingContract> queryByScreen(TLeasingContractQueryForm tLeasingContractQueryForm);

    /**
     * 新增数据
     *
     * @param tLeasingContract 实例对象
     * @return 实例对象
     */
    TLeasingContract insert(TLeasingContract tLeasingContract);

    /**
     * 批量新增数据
     *
     * @param TLeasingContractList 实例对象列表
     * @return 影响行数
     */
    boolean insertBatch(List<TLeasingContract> TLeasingContractList);

    /**
     * 修改数据
     *
     * @param tLeasingContract 实例对象
     * @return 实例对象
     */
    TLeasingContract update(TLeasingContract tLeasingContract);

    /**
     * 批量修改数据
     *
     * @param tLeasingContractList 实例对象列表
     * @return 影响行数
     */
    boolean updateBatch(List<TLeasingContract> tLeasingContractList);

    /**
     * 通过主键删除数据
     *
     * @param leaseId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer leaseId);

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 是否成功
     */
    boolean deleteBatch(List<Integer> ids);
}
