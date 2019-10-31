package com.mr.mall.mall_promotion;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@MapperScan("com.mr.mall.mall_promotion.mapper")
public class MallPromotionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallPromotionApplication.class, args);
    }

}
