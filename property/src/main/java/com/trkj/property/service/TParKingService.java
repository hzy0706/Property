package com.trkj.property.service;

import com.trkj.property.entity.TParking;
import com.trkj.property.entity.TParkingsales;

import java.util.List;

public interface TParKingService {
    List<TParking> selectTParKing();//显示
    TParking insertTRarKing(TParking tParking);//新增
    TParking updateTParKing(TParking tParking);//修改
    List<TParking> selectstate(String value3,String value2);//多条件查询
    List<TParkingsales> selectmanagemen();
    TParking updateState(TParking tParking);//修改状态

}
