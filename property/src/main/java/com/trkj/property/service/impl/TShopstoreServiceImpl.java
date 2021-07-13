package com.trkj.property.service.impl;

import com.trkj.property.entity.TShopstore;
import com.trkj.property.vo.form.TShopstoreQueryForm;
import com.trkj.property.dao.TShopstoreDao;
import com.trkj.property.service.TShopstoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * (TShopstore)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 15:16:39
 */
@Service("tShopstoreService")
@Transactional(rollbackFor=Exception.class)
public class TShopstoreServiceImpl implements TShopstoreService {
    @Resource
    private TShopstoreDao tShopstoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stoId 主键
     * @return 实例对象
     */
    @Override
    public TShopstore queryById(Integer stoId) {
        return this.tShopstoreDao.queryById(stoId);
    }

    /**
     * 查询所有数据
     *
     * @param tShopstoreQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<TShopstore> queryAll(TShopstoreQueryForm tShopstoreQueryForm) {
        Page<TShopstore> page = PageHelper.startPage(tShopstoreQueryForm.getPageNum(), tShopstoreQueryForm.getPageSize());
        List<TShopstore> tShopstoreList = this.tShopstoreDao.queryAll(tShopstoreQueryForm);
        return new PageInfo<>(tShopstoreList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tShopstoreQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TShopstore> queryBySearch(TShopstoreQueryForm tShopstoreQueryForm) {
        Page<TShopstore> page = PageHelper.startPage(tShopstoreQueryForm.getPageNum(), tShopstoreQueryForm.getPageSize());
        List<TShopstore> tShopstoreList = this.tShopstoreDao.queryOrByPojo(tShopstoreQueryForm);
        return new PageInfo<>(tShopstoreList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tShopstoreQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TShopstore> queryByScreen(TShopstoreQueryForm tShopstoreQueryForm) {
        Page<TShopstore> page = PageHelper.startPage(tShopstoreQueryForm.getPageNum(), tShopstoreQueryForm.getPageSize());
        List<TShopstore> tShopstoreList = this.tShopstoreDao.queryAndByPojo(tShopstoreQueryForm);
        return new PageInfo<>(tShopstoreList);
    }

    /**
     * 新增数据
     *
     * @param tShopstore 实例对象
     * @return 实例对象
     */
    @Override
    public TShopstore insert(TShopstore tShopstore) {
        this.tShopstoreDao.insert(tShopstore);
        return this.queryById(tShopstore.getStoId());
    }

    /**
     * 批量新增数据
     *
     * @param TShopstoreList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean insertBatch(List<TShopstore> TShopstoreList) {
        return this.tShopstoreDao.insertBatch(TShopstoreList) == -1;
    }

    /**
     * 修改数据
     *
     * @param tShopstore 实例对象
     * @return 实例对象
     */
    @Override
    public TShopstore update(TShopstore tShopstore) {
        this.tShopstoreDao.update(tShopstore);
        return this.queryById(tShopstore.getStoId());
    }

    /**
     * 批量修改数据
     *
     * @param tShopstoreList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean updateBatch(List<TShopstore> tShopstoreList) {
        return this.tShopstoreDao.updateBatch(tShopstoreList) == -1;
    }

    /**
     * 通过主键删除数据
     *
     * @param stoId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stoId) {
        return this.tShopstoreDao.deleteById(stoId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.tShopstoreDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
