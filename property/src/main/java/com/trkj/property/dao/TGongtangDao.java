package com.trkj.property.dao;

import com.trkj.property.entity.TGongtang;
import com.trkj.property.vo.form.TGongtangQueryForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TGongtang)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-14 05:50:48
 */
@Mapper
public interface TGongtangDao {

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
    List<TGongtang> queryAll(TGongtangQueryForm tGongtangQueryForm);

    /**
     * 通过实体作为或者条件查询
     *
     * @param tGongtangQueryForm 实例对象
     * @return 对象列表
     */
    List<TGongtang> queryOrByPojo(TGongtangQueryForm tGongtangQueryForm);

    /**
     * 通过实体作为并且条件查询
     *
     * @param tGongtangQueryForm 实例对象
     * @return 对象列表
     */
    List<TGongtang> queryAndByPojo(TGongtangQueryForm tGongtangQueryForm);

    /**
     * 新增数据
     *
     * @param tGongtang 实例对象
     * @return 影响行数
     */
    int insert(TGongtang tGongtang);

    /**
     * 批量新增数据
     *
     * @param tGongtangList 实例对象列表
     * @return 影响行数
     */
    int insertBatch(List<TGongtang> tGongtangList);

    /**
     * 修改数据
     *
     * @param tGongtang 实例对象
     * @return 影响行数
     */
    int update(TGongtang tGongtang);

    /**
     * 批量修改数据
     *
     * @param tGongtangList 实例对象列表
     * @return 影响行数
     */
    int updateBatch(List<TGongtang> tGongtangList);

    /**
     * 通过主键删除数据
     *
     * @param gId 主键
     * @return 影响行数
     */
    int deleteById(Integer gId);

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
     * @param tGongtangList 实例对象列表
     * @return 影响行数
     */
    int deleteBatchByEntities(List<TGongtang> tGongtangList);
}

