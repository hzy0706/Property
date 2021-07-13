package com.trkj.property.service.impl;

import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;
import com.trkj.property.dao.TCostitemDao;
import com.trkj.property.service.TCostitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * (TCostitem)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 12:04:59
 */
@Service("tCostitemService")
public class TCostitemServiceImpl implements TCostitemService {
    @Resource
    private TCostitemDao tCostitemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ctId 主键
     * @return 实例对象
     */
    @Override
    public TCostitem queryById(Integer ctId) {
        return this.tCostitemDao.queryById(ctId);
    }

    /**
     * 查询所有数据
     *
     * @param tCostitemQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm) {
        Page<TCostitem> page = PageHelper.startPage(tCostitemQueryForm.getPageNum(), tCostitemQueryForm.getPageSize());
        List<TCostitem> tCostitemList = this.tCostitemDao.queryAll(tCostitemQueryForm);
        return new PageInfo<>(tCostitemList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tCostitemQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TCostitem> queryBySearch(TCostitemQueryForm tCostitemQueryForm) {
        Page<TCostitem> page = PageHelper.startPage(tCostitemQueryForm.getPageNum(), tCostitemQueryForm.getPageSize());
        List<TCostitem> tCostitemList = this.tCostitemDao.queryOrByPojo(tCostitemQueryForm);
        return new PageInfo<>(tCostitemList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tCostitemQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TCostitem> queryByScreen(TCostitemQueryForm tCostitemQueryForm) {
        Page<TCostitem> page = PageHelper.startPage(tCostitemQueryForm.getPageNum(), tCostitemQueryForm.getPageSize());
        List<TCostitem> tCostitemList = this.tCostitemDao.queryAndByPojo(tCostitemQueryForm);
        return new PageInfo<>(tCostitemList);
    }

    /**
     * 新增数据
     *
     * @param tCostitem 实例对象
     * @return 实例对象
     */
    @Override
    public TCostitem insert(TCostitem tCostitem) {
        this.tCostitemDao.insert(tCostitem);
        return this.queryById(tCostitem.getCtId());
    }

    /**
     * 批量新增数据
     *
     * @param TCostitemList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean insertBatch(List<TCostitem> TCostitemList) {
        return this.tCostitemDao.insertBatch(TCostitemList) == -1;
    }

    /**
     * 修改数据
     *
     * @param tCostitem 实例对象
     * @return 实例对象
     */
    @Override
    public TCostitem update(TCostitem tCostitem) {
        this.tCostitemDao.update(tCostitem);
        return this.queryById(tCostitem.getCtId());
    }

    /**
     * 批量修改数据
     *
     * @param tCostitemList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean updateBatch(List<TCostitem> tCostitemList) {
        return this.tCostitemDao.updateBatch(tCostitemList) == -1;
    }

    /**
     * 通过主键删除数据
     *
     * @param ctId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ctId) {
        return this.tCostitemDao.deleteById(ctId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.tCostitemDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
