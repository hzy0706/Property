package com.trkj.property.service.impl;

import com.trkj.property.entity.TGongtang;
import com.trkj.property.vo.form.TGongtangQueryForm;
import com.trkj.property.dao.TGongtangDao;
import com.trkj.property.service.TGongtangService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * (TGongtang)表服务实现类
 *
 * @author makejava
 * @since 2021-07-14 05:50:50
 */
@Service("tGongtangService")
public class TGongtangServiceImpl implements TGongtangService {
    @Resource
    private TGongtangDao tGongtangDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gId 主键
     * @return 实例对象
     */
    @Override
    public TGongtang queryById(Integer gId) {
        return this.tGongtangDao.queryById(gId);
    }

    /**
     * 查询所有数据
     *
     * @param tGongtangQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<TGongtang> queryAll(TGongtangQueryForm tGongtangQueryForm) {
        Page<TGongtang> page = PageHelper.startPage(tGongtangQueryForm.getPageNum(), tGongtangQueryForm.getPageSize());
        List<TGongtang> tGongtangList = this.tGongtangDao.queryAll(tGongtangQueryForm);
        return new PageInfo<>(tGongtangList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tGongtangQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TGongtang> queryBySearch(TGongtangQueryForm tGongtangQueryForm) {
        Page<TGongtang> page = PageHelper.startPage(tGongtangQueryForm.getPageNum(), tGongtangQueryForm.getPageSize());
        List<TGongtang> tGongtangList = this.tGongtangDao.queryOrByPojo(tGongtangQueryForm);
        return new PageInfo<>(tGongtangList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tGongtangQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TGongtang> queryByScreen(TGongtangQueryForm tGongtangQueryForm) {
        Page<TGongtang> page = PageHelper.startPage(tGongtangQueryForm.getPageNum(), tGongtangQueryForm.getPageSize());
        List<TGongtang> tGongtangList = this.tGongtangDao.queryAndByPojo(tGongtangQueryForm);
        return new PageInfo<>(tGongtangList);
    }

    /**
     * 新增数据
     *
     * @param tGongtang 实例对象
     * @return 实例对象
     */
    @Override
    public TGongtang insert(TGongtang tGongtang) {
        this.tGongtangDao.insert(tGongtang);
        return this.queryById(tGongtang.getGId());
    }

    /**
     * 批量新增数据
     *
     * @param TGongtangList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean insertBatch(List<TGongtang> TGongtangList) {
        return this.tGongtangDao.insertBatch(TGongtangList) == -1;
    }

    /**
     * 修改数据
     *
     * @param tGongtang 实例对象
     * @return 实例对象
     */
    @Override
    public TGongtang update(TGongtang tGongtang) {
        this.tGongtangDao.update(tGongtang);
        return this.queryById(tGongtang.getGId());
    }

    /**
     * 批量修改数据
     *
     * @param tGongtangList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean updateBatch(List<TGongtang> tGongtangList) {
        return this.tGongtangDao.updateBatch(tGongtangList) == -1;
    }

    /**
     * 通过主键删除数据
     *
     * @param gId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer gId) {
        return this.tGongtangDao.deleteById(gId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.tGongtangDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
