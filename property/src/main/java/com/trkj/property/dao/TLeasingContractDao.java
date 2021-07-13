package com.trkj.property.dao;

import com.trkj.property.entity.TLeasingContract;
import com.trkj.property.vo.form.TLeasingContractQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TLeasingContract)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 15:14:45
 */
@Mapper
public interface TLeasingContractDao {

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
    List<TLeasingContract> queryAll(TLeasingContractQueryForm tLeasingContractQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param tLeasingContractQueryForm 实例对象
     * @return 对象列表
     */
    List<TLeasingContract> queryOrByPojo(TLeasingContractQueryForm tLeasingContractQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param tLeasingContractQueryForm 实例对象
     * @return 对象列表
     */
    List<TLeasingContract> queryAndByPojo(TLeasingContractQueryForm tLeasingContractQueryForm);

    /**
     * 新增数据
     *
     * @param tLeasingContract 实例对象
     * @return 影响行数
     */
    int insert(TLeasingContract tLeasingContract);

    /**
     * 批量新增数据
     *
     * @param tLeasingContractList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<TLeasingContract> tLeasingContractList);

    /**
     * 修改数据
     *
     * @param tLeasingContract 实例对象
     * @return 影响行数
     */
    int update(TLeasingContract tLeasingContract);

    /**
     * 批量修改数据
     *
     * @param tLeasingContractList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<TLeasingContract> tLeasingContractList);

    /**
     * 通过主键删除数据
     *
     * @param leaseId 主键
     * @return 影响行数
     */
    int deleteById(Integer leaseId);

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
     * @param tLeasingContractList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<TLeasingContract> tLeasingContractList);
}

