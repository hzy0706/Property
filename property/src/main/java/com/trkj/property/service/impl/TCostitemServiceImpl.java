package com.trkj.property.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.property.dao.TCostitemDao;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;
import org.springframework.stereotype.Service;
import com.trkj.property.service.TCostitemService;

import javax.annotation.Resource;
import java.util.List;

@Service("tcostitemService")
public class TCostitemServiceImpl implements TCostitemService{
    @Resource
    private TCostitemDao tCostitemDao;

    /**
     *
     * 查询所有方法
     * */
    @Override
    public PageInfo<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm) {
        Page<TCostitem> page = PageHelper.startPage(tCostitemQueryForm.getPageNum(),tCostitemQueryForm.getPageSize());
        List<TCostitem> tCostitemList = this.tCostitemDao.queryAll(tCostitemQueryForm);
        return new PageInfo<>(tCostitemList);
    }
}
