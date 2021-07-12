package com.trkj.property.dao;

import com.trkj.property.entity.TCostitem;
import com.trkj.property.vo.form.TCostitemQueryForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TCostitemDao {
    List<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm);
}