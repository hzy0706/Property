package com.trkj.property.service.impl;

import com.trkj.property.entity.TMerchant;
import com.trkj.property.vo.form.TMerchantQueryForm;
import com.trkj.property.dao.TMerchantDao;
import com.trkj.property.service.TMerchantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * (TMerchant)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:55:15
 */
@Service("tMerchantService")
@Transactional(rollbackFor=Exception.class)
public class TMerchantServiceImpl implements TMerchantService {
    @Resource
    private TMerchantDao tMerchantDao;

    /**
     * 通过ID查询单条数据
     *
     * @param merId 主键
     * @return 实例对象
     */
    @Override
    public TMerchant queryById(Integer merId) {
        return this.tMerchantDao.queryById(merId);
    }

    /**
     * 查询所有数据
     *
     * @param tMerchantQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<TMerchant> queryAll(TMerchantQueryForm tMerchantQueryForm) {
        Page<TMerchant> page = PageHelper.startPage(tMerchantQueryForm.getPageNum(), tMerchantQueryForm.getPageSize());
        List<TMerchant> tMerchantList = this.tMerchantDao.queryAll(tMerchantQueryForm);
        return new PageInfo<>(tMerchantList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tMerchantQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TMerchant> queryBySearch(TMerchantQueryForm tMerchantQueryForm) {
        Page<TMerchant> page = PageHelper.startPage(tMerchantQueryForm.getPageNum(), tMerchantQueryForm.getPageSize());
        List<TMerchant> tMerchantList = this.tMerchantDao.queryOrByPojo(tMerchantQueryForm);
        return new PageInfo<>(tMerchantList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tMerchantQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TMerchant> queryByScreen(TMerchantQueryForm tMerchantQueryForm) {
        Page<TMerchant> page = PageHelper.startPage(tMerchantQueryForm.getPageNum(), tMerchantQueryForm.getPageSize());
        List<TMerchant> tMerchantList = this.tMerchantDao.queryAndByPojo(tMerchantQueryForm);
        return new PageInfo<>(tMerchantList);
    }

    /**
     * 新增数据
     *
     * @param tMerchant 实例对象
     * @return 实例对象
     */
    @Override
    public TMerchant insert(TMerchant tMerchant) {
        this.tMerchantDao.insert(tMerchant);
        return this.queryById(tMerchant.getMerId());
    }

    /**
     * 批量新增数据
     *
     * @param TMerchantList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean insertBatch(List<TMerchant> TMerchantList) {
        return this.tMerchantDao.insertBatch(TMerchantList) == -1;
    }

    /**
     * 修改数据
     *
     * @param tMerchant 实例对象
     * @return 实例对象
     */
    @Override
    public TMerchant update(TMerchant tMerchant) {
        this.tMerchantDao.update(tMerchant);
        return this.queryById(tMerchant.getMerId());
    }

    /**
     * 批量修改数据
     *
     * @param tMerchantList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean updateBatch(List<TMerchant> tMerchantList) {
        for(TMerchant aa:tMerchantList){
            this.tMerchantDao.update(aa);
        }

        return Boolean.parseBoolean(null);
    }

    /**
     * 通过主键删除数据
     *
     * @param merId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer merId) {
        return this.tMerchantDao.deleteById(merId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.tMerchantDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
