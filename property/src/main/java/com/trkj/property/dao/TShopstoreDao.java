package com.trkj.property.dao;

import com.trkj.property.entity.TShopstore;
import com.trkj.property.vo.form.TShopstoreQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TShopstore)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 15:16:38
 */
@Mapper
public interface TShopstoreDao {

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
    List<TShopstore> queryAll(TShopstoreQueryForm tShopstoreQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param tShopstoreQueryForm 实例对象
     * @return 对象列表
     */
    List<TShopstore> queryOrByPojo(TShopstoreQueryForm tShopstoreQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param tShopstoreQueryForm 实例对象
     * @return 对象列表
     */
    List<TShopstore> queryAndByPojo(TShopstoreQueryForm tShopstoreQueryForm);

    /**
     * 新增数据
     *
     * @param tShopstore 实例对象
     * @return 影响行数
     */
    int insert(TShopstore tShopstore);

    /**
     * 批量新增数据
     *
     * @param tShopstoreList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<TShopstore> tShopstoreList);

    /**
     * 修改数据
     *
     * @param tShopstore 实例对象
     * @return 影响行数
     */
    int update(TShopstore tShopstore);

    /**
     * 批量修改数据
     *
     * @param tShopstoreList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<TShopstore> tShopstoreList);

    /**
     * 通过主键删除数据
     *
     * @param stoId 主键
     * @return 影响行数
     */
    int deleteById(Integer stoId);

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
     * @param tShopstoreList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<TShopstore> tShopstoreList);
}

