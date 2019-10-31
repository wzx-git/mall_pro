package com.mr.mall.mall_admin.client;

import com.mr.mall.mall_admin.utils.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient("mallCommodity")
public interface MallCommodity {

    @PostMapping("/brand/update/showStatus")
    @ResponseBody
    CommonResult updateShowStatus();



}
