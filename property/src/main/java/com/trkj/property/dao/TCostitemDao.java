package com.trkj.property.dao;

import com.trkj.property.entity.TCostitem;
<<<<<<< HEAD
import com.trkj.property.vo.form.TCostitemQueryForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
=======
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TCostitemDao {
    int deleteByPrimaryKey(Integer ctId);

    int insert(TCostitem record);

    int insertSelective(TCostitem record);
>>>>>>> 676be3f957784a1f54d912265c64122e392ba734

@Mapper
public interface TCostitemDao {
    List<TCostitem> queryAll(TCostitemQueryForm tCostitemQueryForm);
}