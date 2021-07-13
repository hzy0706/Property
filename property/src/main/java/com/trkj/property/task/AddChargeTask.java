package com.trkj.property.task;


import com.trkj.property.dao.BillDao;
import com.trkj.property.dao.ChargeCostDao;
import com.trkj.property.dao.TParameterDao;
import com.trkj.property.entity.TChargeCosts;
import com.trkj.property.entity.TCostitem;
import com.trkj.property.entity.TParameterDetail;
import com.trkj.property.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


/**
 * author:wjh
 * 定时任务，每天执行一次，将台账中的截止日期截取计算，然后符合条件的保存到bill  billdetail表中
 */
@Configuration
public class AddChargeTask {

    //注入dao
    @Autowired
    TParameterDao tParameterDao;

    @Autowired
    ChargeCostDao chargeCostDao;

//    @Scheduled(cron = "")
//    public void test(){
//    }
    /**
     * 0 0 0 * * ? *
     * 每天凌晨扫描一遍台账记录表，然后将表拆了
     * 0/3 * * * * ? *  --->测试
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void getPars(){

        List<TParameterDetail> allParDetails = chargeCostDao.findAllParDetail();
        System.out.println(allParDetails);

        allParDetails.forEach(tParameterDetail -> {

            //创建一个收费项对象
            TChargeCosts tChargeCosts = new TChargeCosts();
            //获取费项名
            TCostitem costItemById = tParameterDao.getCostItemById(tParameterDetail.getCtId());
            String ctName = costItemById.getCtName();
            tChargeCosts.setCtName(ctName);
            //费项单价、实收价格
            tChargeCosts.setCostMoney(costItemById.getCtSubtotal());
            tChargeCosts.setChargeCostAssessment(tParameterDetail.getParDeAssessment());
            //滞纳金率
            tChargeCosts.setOverduefineMoney(costItemById.getOverduefine());

            tChargeCosts.setBreakMoney(0.00);

            tChargeCosts.setChargeTime(null);

            //限期时间
            tChargeCosts.setOverdueTime(tParameterDetail.getParDeDeadline());

            //是否处理
            tChargeCosts.setHasCharge(0);

            //处理台账的开始时间、并把修改后的时间存入到台账详情表中
            //开起始时间还是起始时间，但是截至时间应该变为开始时间加一个月
            //然后将当前时间修改到台账详情的起始时间
            Date initBeginTime = tParameterDetail.getParDeBegin();
            tChargeCosts.setChargeCostsBegintime(initBeginTime);

            //给起始时间加一个月
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(initBeginTime);
            calendar.add(Calendar.MONTH,1);
            Date afterTime = calendar.getTime();
            //修改到数据库
            tParameterDetail.setParDeBegin(afterTime);
            chargeCostDao.updateParDetailByDate(tParameterDetail);

            tChargeCosts.setChargeCostsEndtime(afterTime);

            Integer addResult = chargeCostDao.addCharge(tChargeCosts);
            if (addResult > 0){
                //可以接收到新增后返回的主键id值,用来新增
                System.out.println(tParameterDetail.getParDeId());
                System.out.println(1 == addResult?"定时任务执行成功！":"定时任务执行失败，新增收费项时失败o(╥﹏╥)o");
            }
            System.out.println("新增后的打印"+tChargeCosts);

        });


    }


}
