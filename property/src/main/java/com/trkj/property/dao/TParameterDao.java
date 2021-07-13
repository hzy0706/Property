package com.trkj.property.dao;

import com.trkj.property.entity.TCostitem;
import com.trkj.property.entity.TParameter;
import com.trkj.property.entity.TParameterDetail;
import com.trkj.property.entity.TResidence;
import com.trkj.property.vo.GetParsVO;
import com.trkj.property.vo.ParAndHouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface TParameterDao {






    /**
     * 根据费项 新增台账记录
     */
    Integer addParameter(TParameter tParameter);

    /**
     * 根据费项id获取费项信息
     */
    TCostitem getCostItemById(@Param("ctId") Integer id);

    /**
     * 新增台账详情记录
     */
    Integer addParameterDetail(TParameterDetail tParameterDetail);


    /**
     * 通过楼盘id查询所有的台账
     */
    List<ParAndHouse> findAllParByResId(@Param("resId") Integer residenceId);

    /**
     * 通过台账名字查询该名字台账的id
     */
    Integer findParIdByName(@Param("parName") String parName);


    /**
     * 根据台账名称查看台账记录中的台账详情列表
     */
    List<GetParsVO> findDetailsByParId(@Param("parId") Integer parId);


}