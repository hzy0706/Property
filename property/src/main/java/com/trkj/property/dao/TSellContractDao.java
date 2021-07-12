package com.trkj.property.dao;

import com.trkj.property.entity.TSellContract;
import com.trkj.property.vo.form.TSellContractQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TSellContract)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 15:15:46
 */
@Mapper
public interface TSellContractDao {

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
    List<TSellContract> queryAll(TSellContractQueryForm tSellContractQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param tSellContractQueryForm 实例对象
     * @return 对象列表
     */
    List<TSellContract> queryOrByPojo(TSellContractQueryForm tSellContractQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param tSellContractQueryForm 实例对象
     * @return 对象列表
     */
    List<TSellContract> queryAndByPojo(TSellContractQueryForm tSellContractQueryForm);

    /**
     * 新增数据
     *
     * @param tSellContract 实例对象
     * @return 影响行数
     */
    int insert(TSellContract tSellContract);

    /**
     * 批量新增数据
     *
     * @param tSellContractList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<TSellContract> tSellContractList);

    /**
     * 修改数据
     *
     * @param tSellContract 实例对象
     * @return 影响行数
     */
    int update(TSellContract tSellContract);

    /**
     * 批量修改数据
     *
     * @param tSellContractList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<TSellContract> tSellContractList);

    /**
     * 通过主键删除数据
     *
     * @param sellId 主键
     * @return 影响行数
     */
    int deleteById(Integer sellId);

    /**
     * 通过主键列表删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    int deleteBatch(List<Integer> ids);

    /**
     * 批量对象列表删除数据
     *
     * @param tSellContractList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<TSellContract> tSellContractList);
}

