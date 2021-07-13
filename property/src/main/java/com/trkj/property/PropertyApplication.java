package com.trkj.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/***
 * @author 胡志远
 * @date 2021-07-11
 */
@SpringBootApplication
@EnableScheduling     //开启定时任务
public class PropertyApplication {
    public static void main(String[] args) {
        SpringApplication.run(PropertyApplication.class, args);
    }

}
