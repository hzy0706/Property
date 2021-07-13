package com.trkj.property.service;

import com.trkj.property.entity.TParameter;
import com.trkj.property.entity.TParameterDetail;
import com.trkj.property.vo.GetParsVO;
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

    /**
     * 根据台账名称查看台账记录中的台账详情列表
     */
    List<GetParsVO> findDetailsByParName(String parName);
}
