package com.trkj.property.service;

import com.trkj.property.entity.TParking;

import java.util.List;

public interface TParKingService {
    List<TParking> selectTParKing();//显示
    TParking insertTRarKing(TParking tParking);//新增
    TParking updateTParKing(TParking tParking);//修改

}
