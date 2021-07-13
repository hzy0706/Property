package com.trkj.property.service.impl;

import com.trkj.property.dao.BillDao;
import com.trkj.property.dao.BillDetailDao;
import com.trkj.property.entity.TBill;
import com.trkj.property.entity.TBillDetail;
import com.trkj.property.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BillServiceImpl implements BillService {


    @Autowired
    private BillDao billDao;

    @Autowired
    private BillDetailDao billDetailDao;

    @Override
    public Integer addBill(TBill bill) {


        Integer result = billDao.addBillByCharge(bill);
        //获取需要传入的
//        TBillDetail billDetail = getBillDetail(bill);
//        Integer integer = billDetailDao.addBillDeatil(billDetail);
        return result;
    }

    /**
     * 传入Bill返回BillDetail
     */
//    public static TBillDetail getBillDetail(TBill tBill) {
//        TBillDetail tBillDetail = new TBillDetail();
//
//    }
}
