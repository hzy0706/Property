package com.trkj.property.service;

import com.github.pagehelper.PageInfo;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;

public interface TCostitemService {
    PageInfo<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm);
}
