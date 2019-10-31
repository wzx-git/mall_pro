package com.mr.mall.mall_comment.controller;

import com.mr.mall.mall_comment.entity.SmsHomeBrand;
import com.mr.mall.mall_comment.service.ISmsHomeBrandService;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by XuanAndWang on 2019/10/26.
 */
@RequestMapping("/home/brand")
@Controller
public class SmsHomeBrandController {


    @Autowired
    private ISmsHomeBrandService smsHomeBrandService;


    /*/**
    * @Description: 查询方法
    * @Param: [sms, pageSize, pageNum]
    * @return: com.mr.mall.mall_comment.utils.CommonResult<com.mr.mall.mall_comment.utils.PageUtils<com.mr.mall.mall_comment.entity.SmsHomeBrand>>
    * @Author:lw
    * @Date: 2019/10/31
    */
    @ResponseBody
    @RequestMapping("/findHomeBrand")
    public CommonResult<PageUtils<SmsHomeBrand>> findHomeBrand(SmsHomeBrand sms,
                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        CommonResult<PageUtils<SmsHomeBrand>> retData= smsHomeBrandService.findHomeBrand(pageSize,pageNum);
        System.err.println(retData);
        return retData;

    }


    @ResponseBody
    @PostMapping("/delete")
    public CommonResult deletes(@RequestParam("ids") List<Long> ids){
        return smsHomeBrandService.deletes(ids);
    }


}
