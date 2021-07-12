package com.trkj.property.dao;

import com.trkj.property.entity.TParking;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TParkingDao {
    int deleteByPrimaryKey(Integer parkingId);

    int insert(TParking record);

    int insertTRarKing(TParking tParking);//新增车位信息

    List<TParking> selectTParKing();//显示车位信息

    int updateTParKing(TParking tParking);//修改车位信息

    List<TParking> selectstate(String value3);//根据车位状态查询

    int updateByPrimaryKey(TParking record);
}