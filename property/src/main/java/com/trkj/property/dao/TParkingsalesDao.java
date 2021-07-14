package com.trkj.property.dao;

import com.trkj.property.entity.TParkingsales;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TParkingsalesDao {
    int deleteByPrimaryKey(Integer parkingsalesId);

    int insert(TParkingsales record);

    int insertTParKing(TParkingsales tParkingsales);//新增车位销售信息

    List<TParkingsales> selectTParKingsales();



    int updateByPrimaryKeySelective(TParkingsales record);

    int updateTParkingSales(TParkingsales record);//修改车位销售信息

    List<TParkingsales> selectlicense(String value1,String value2);//多条件查询
}