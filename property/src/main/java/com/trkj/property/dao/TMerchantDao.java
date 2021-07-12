package com.trkj.property.dao;

import com.trkj.property.entity.TMerchant;
import com.trkj.property.vo.form.TMerchantQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TMerchant)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:55:15
 */
@Mapper
public interface TMerchantDao {

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
    List<TMerchant> queryAll(TMerchantQueryForm tMerchantQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param tMerchantQueryForm 实例对象
     * @return 对象列表
     */
    List<TMerchant> queryOrByPojo(TMerchantQueryForm tMerchantQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param tMerchantQueryForm 实例对象
     * @return 对象列表
     */
    List<TMerchant> queryAndByPojo(TMerchantQueryForm tMerchantQueryForm);

    /**
     * 新增数据
     *
     * @param tMerchant 实例对象
     * @return 影响行数
     */
    int insert(TMerchant tMerchant);

    /**
     * 批量新增数据
     *
     * @param tMerchantList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<TMerchant> tMerchantList);

    /**
     * 修改数据
     *
     * @param tMerchant 实例对象
     * @return 影响行数
     */
    int update(TMerchant tMerchant);

    /**
     * 批量修改数据
     *
     * @param tMerchantList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<TMerchant> tMerchantList);

    /**
     * 通过主键删除数据
     *
     * @param merId 主键
     * @return 影响行数
     */
    int deleteById(Integer merId);

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
     * @param tMerchantList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<TMerchant> tMerchantList);
}

