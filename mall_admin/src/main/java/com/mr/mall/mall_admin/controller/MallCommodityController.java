package com.mr.mall.mall_admin.controller;

import com.mr.mall.mall_admin.client.MallCommodity;
import com.mr.mall.mall_admin.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallCommodityController {

    @Autowired
    private MallCommodity mallCommodity;

    @RequestMapping("/brand/update/showStatus")
    public CommonResult testOrder(){
        CommonResult commonResult = mallCommodity.updateShowStatus();
        return commonResult;
    }



}
