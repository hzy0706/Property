package com.trkj.property.dao;

import com.trkj.property.entity.TParking;
import com.trkj.property.entity.TParkingsales;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface TParkingDao {
    int deleteByPrimaryKey(Integer parkingId);

    int insert(TParking record);

    int insertTRarKing(TParking tParking);//新增车位信息

    List<TParking> selectTParKing();//显示车位信息

    List<TParkingsales> selectmanagemen();//显示管理类别为出售的

    int updateTParKing(TParking tParking);//修改车位信息

    int updateState(TParking tParking);//修改状态

    List<TParking> selectstate(String value3,String value2);//多条件查询

    int updateByPrimaryKey(TParking record);
}