package com.trkj.property.service.impl;

import com.trkj.property.dao.BillDetailDao;
import com.trkj.property.entity.TBillDetail;
import com.trkj.property.service.BillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDetailServiceImpl implements BillDetailService {

    @Autowired
    private BillDetailDao billDetailDao;


    @Override
    public Integer addBillDetail(TBillDetail tBillDetail) {

        return billDetailDao.addBillDeatil(tBillDetail);

    }

    @Override
    public List<TBillDetail> findAllDetail() {
        return billDetailDao.findAllBillDetails();
    }

    @Override
    public List<TBillDetail> findBillDetailByHouseId(Integer houseId) {
        return billDetailDao.findBillDetailByHouseId(houseId);
    }
}
