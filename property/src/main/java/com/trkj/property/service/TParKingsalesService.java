package com.trkj.property.service;

import com.trkj.property.entity.TParkingsales;

import java.util.List;

public interface TParKingsalesService {
    List<TParkingsales> selectTParKingsales();//显示
    TParkingsales updateTParkingSales(TParkingsales tParkingsales);//修改
    TParkingsales insertTParKing(TParkingsales tParkingsales);//新增
    List<TParkingsales> selectlicense(String value1,String value2);//多条件查询

}
