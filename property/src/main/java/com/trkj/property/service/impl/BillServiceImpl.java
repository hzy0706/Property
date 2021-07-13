package com.trkj.property.service.impl;

import com.trkj.property.dao.BillDao;
import com.trkj.property.entity.TBill;
import com.trkj.property.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BillServiceImpl implements BillService {


    @Autowired
    private BillDao billDao;

    @Override
    public Integer addBill(TBill bill) {


        Integer result = billDao.addBillByCharge(bill);



        return result;
    }
}
