package com.trkj.property.dao;

import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TCostitem)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 12:04:57
 */
@Mapper
public interface TCostitemDao {

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
    List<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param tCostitemQueryForm 实例对象
     * @return 对象列表
     */
    List<TCostitem> queryOrByPojo(TCostitemQueryForm tCostitemQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param tCostitemQueryForm 实例对象
     * @return 对象列表
     */
    List<TCostitem> queryAndByPojo(TCostitemQueryForm tCostitemQueryForm);

    /**
     * 新增数据
     *
     * @param tCostitem 实例对象
     * @return 影响行数
     */
    int insert(TCostitem tCostitem);

    /**
     * 批量新增数据
     *
     * @param tCostitemList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<TCostitem> tCostitemList);

    /**
     * 修改数据
     *
     * @param tCostitem 实例对象
     * @return 影响行数
     */
    int update(TCostitem tCostitem);

    /**
     * 批量修改数据
     *
     * @param tCostitemList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<TCostitem> tCostitemList);

    /**
     * 通过主键删除数据
     *
     * @param ctId 主键
     * @return 影响行数
     */
    int deleteById(Integer ctId);

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
     * @param tCostitemList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<TCostitem> tCostitemList);
}

