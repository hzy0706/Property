package com.trkj.property.service.impl;

import com.trkj.property.entity.TSellContract;
import com.trkj.property.vo.form.TSellContractQueryForm;
import com.trkj.property.dao.TSellContractDao;
import com.trkj.property.service.TSellContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * (TSellContract)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 15:15:46
 */
@Service("tSellContractService")
public class TSellContractServiceImpl implements TSellContractService {
    @Resource
    private TSellContractDao tSellContractDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sellId 主键
     * @return 实例对象
     */
    @Override
    public TSellContract queryById(Integer sellId) {
        return this.tSellContractDao.queryById(sellId);
    }

    /**
     * 查询所有数据
     *
     * @param tSellContractQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<TSellContract> queryAll(TSellContractQueryForm tSellContractQueryForm) {
        Page<TSellContract> page = PageHelper.startPage(tSellContractQueryForm.getPageNum(), tSellContractQueryForm.getPageSize());
        List<TSellContract> tSellContractList = this.tSellContractDao.queryAll(tSellContractQueryForm);
        return new PageInfo<>(tSellContractList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tSellContractQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TSellContract> queryBySearch(TSellContractQueryForm tSellContractQueryForm) {
        Page<TSellContract> page = PageHelper.startPage(tSellContractQueryForm.getPageNum(), tSellContractQueryForm.getPageSize());
        List<TSellContract> tSellContractList = this.tSellContractDao.queryOrByPojo(tSellContractQueryForm);
        return new PageInfo<>(tSellContractList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tSellContractQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TSellContract> queryByScreen(TSellContractQueryForm tSellContractQueryForm) {
        Page<TSellContract> page = PageHelper.startPage(tSellContractQueryForm.getPageNum(), tSellContractQueryForm.getPageSize());
        List<TSellContract> tSellContractList = this.tSellContractDao.queryAndByPojo(tSellContractQueryForm);
        return new PageInfo<>(tSellContractList);
    }

    /**
     * 新增数据
     *
     * @param tSellContract 实例对象
     * @return 实例对象
     */
    @Override
    public TSellContract insert(TSellContract tSellContract) {
        this.tSellContractDao.insert(tSellContract);
        return this.queryById(tSellContract.getSellId());
    }

    /**
     * 批量新增数据
     *
     * @param TSellContractList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean insertBatch(List<TSellContract> TSellContractList) {
        return this.tSellContractDao.insertBatch(TSellContractList) == -1;
    }

    /**
     * 修改数据
     *
     * @param tSellContract 实例对象
     * @return 实例对象
     */
    @Override
    public TSellContract update(TSellContract tSellContract) {
        this.tSellContractDao.update(tSellContract);
        return this.queryById(tSellContract.getSellId());
    }

    /**
     * 批量修改数据
     *
     * @param tSellContractList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean updateBatch(List<TSellContract> tSellContractList) {
        return this.tSellContractDao.updateBatch(tSellContractList) == -1;
    }

    /**
     * 通过主键删除数据
     *
     * @param sellId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sellId) {
        return this.tSellContractDao.deleteById(sellId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.tSellContractDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
