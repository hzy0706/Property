package com.trkj.property.service.impl;

import com.trkj.property.entity.TLeasingContract;
import com.trkj.property.vo.form.TLeasingContractQueryForm;
import com.trkj.property.dao.TLeasingContractDao;
import com.trkj.property.service.TLeasingContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * (TLeasingContract)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 15:14:45
 */
@Service("tLeasingContractService")
public class TLeasingContractServiceImpl implements TLeasingContractService {
    @Resource
    private TLeasingContractDao tLeasingContractDao;

    /**
     * 通过ID查询单条数据
     *
     * @param leaseId 主键
     * @return 实例对象
     */
    @Override
    public TLeasingContract queryById(Integer leaseId) {
        return this.tLeasingContractDao.queryById(leaseId);
    }

    /**
     * 查询所有数据
     *
     * @param tLeasingContractQueryForm 实例对象
     * @return 实例对象
     */
    @Override
    public PageInfo<TLeasingContract> queryAll(TLeasingContractQueryForm tLeasingContractQueryForm) {
        Page<TLeasingContract> page = PageHelper.startPage(tLeasingContractQueryForm.getPageNum(), tLeasingContractQueryForm.getPageSize());
        List<TLeasingContract> tLeasingContractList = this.tLeasingContractDao.queryAll(tLeasingContractQueryForm);
        return new PageInfo<>(tLeasingContractList);
    }

    /**
     * 根据查询条件搜索数据
     *
     * @param tLeasingContractQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TLeasingContract> queryBySearch(TLeasingContractQueryForm tLeasingContractQueryForm) {
        Page<TLeasingContract> page = PageHelper.startPage(tLeasingContractQueryForm.getPageNum(), tLeasingContractQueryForm.getPageSize());
        List<TLeasingContract> tLeasingContractList = this.tLeasingContractDao.queryOrByPojo(tLeasingContractQueryForm);
        return new PageInfo<>(tLeasingContractList);
    }

    /**
     * 根据查询条件筛选数据
     *
     * @param tLeasingContractQueryForm
     * @return 对象列表
     */
    @Override
    public PageInfo<TLeasingContract> queryByScreen(TLeasingContractQueryForm tLeasingContractQueryForm) {
        Page<TLeasingContract> page = PageHelper.startPage(tLeasingContractQueryForm.getPageNum(), tLeasingContractQueryForm.getPageSize());
        List<TLeasingContract> tLeasingContractList = this.tLeasingContractDao.queryAndByPojo(tLeasingContractQueryForm);
        return new PageInfo<>(tLeasingContractList);
    }

    /**
     * 新增数据
     *
     * @param tLeasingContract 实例对象
     * @return 实例对象
     */
    @Override
    public TLeasingContract insert(TLeasingContract tLeasingContract) {
        this.tLeasingContractDao.insert(tLeasingContract);
        return this.queryById(tLeasingContract.getLeaseId());
    }

    /**
     * 批量新增数据
     *
     * @param TLeasingContractList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean insertBatch(List<TLeasingContract> TLeasingContractList) {
        return this.tLeasingContractDao.insertBatch(TLeasingContractList) == -1;
    }

    /**
     * 修改数据
     *
     * @param tLeasingContract 实例对象
     * @return 实例对象
     */
    @Override
    public TLeasingContract update(TLeasingContract tLeasingContract) {
        this.tLeasingContractDao.update(tLeasingContract);
        return this.queryById(tLeasingContract.getLeaseId());
    }

    /**
     * 批量修改数据
     *
     * @param tLeasingContractList 实例对象列表
     * @return 影响行数
     */
    @Override
    public boolean updateBatch(List<TLeasingContract> tLeasingContractList) {
        return this.tLeasingContractDao.updateBatch(tLeasingContractList) == -1;
    }

    /**
     * 通过主键删除数据
     *
     * @param leaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer leaseId) {
        return this.tLeasingContractDao.deleteById(leaseId) > 0;
    }

    /**
     * 批量删除数据
     *
     * @param ids 主键列表
     * @return 影响行数
     */
    @Override
    public boolean deleteBatch(List<Integer> ids) {
        int row = this.tLeasingContractDao.deleteBatch(ids);
        return ids.size() == row;
    }
}
