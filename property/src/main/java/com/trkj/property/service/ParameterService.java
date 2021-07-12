package com.trkj.property.service;

import com.trkj.property.entity.TParameter;
import com.trkj.property.vo.ParAndHouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParameterService {



    /**
     * 根据费项 新增台账记录
     */
    Integer addParameter(TParameter tParameter);



    /**
     * 通过楼盘id查询所有的台账
     */
    List<ParAndHouse> findAllParByResId(Integer residenceId);
}
