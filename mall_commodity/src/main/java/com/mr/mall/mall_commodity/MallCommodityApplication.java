package com.mr.mall.mall_commodity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.mr.mall.mall_commodity.mapper")
public class MallCommodityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCommodityApplication.class, args);
    }

}
