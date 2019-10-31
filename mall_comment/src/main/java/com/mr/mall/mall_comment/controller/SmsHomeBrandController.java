package com.mr.mall.mall_comment.controller;

import com.mr.mall.mall_comment.entity.SmsHomeBrand;
import com.mr.mall.mall_comment.service.ISmsHomeBrandService;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    /*/** 
    * @Description: 删除
    * @Param: [ids] 
    * @return: com.mr.mall.mall_comment.utils.CommonResult 
    * @Author:lw
    * @Date: 2019/10/31 
    */ 
    @ResponseBody
    @PostMapping("/delete")
    public CommonResult deletes(@RequestParam("ids") List<Long> ids){
        return smsHomeBrandService.deletes(ids);
    }



    /*/** 
    * @Description: 修改排序状态，修改数量后，数量多的排在上方 
    * @Param: [id, sort] 
    * @return: com.mr.mall.mall_comment.utils.CommonResult 
    * @Author:lw
    * @Date: 2019/10/31 
    */ 
    @ResponseBody
    @PostMapping("/updateSort/{id}")
    public CommonResult updateSort(@PathVariable Long id, Integer sort){
        return smsHomeBrandService.updateSort(id,sort);
    }


    /*/** 
    * @Description: 修改是否推荐 ，单挑推荐，批量推荐没出来效果
    * @Param: [ids, recommendStatus] 
    * @return: com.mr.mall.mall_comment.utils.CommonResult 
    * @Author:lw
    * @Date: 2019/10/31 
    */ 
    @ResponseBody
    @RequestMapping("/updateStatus")
    public CommonResult updateStatus(@RequestParam("ids") List<Long> ids,@RequestParam Integer recommendStatus){
        return smsHomeBrandService.updateStatus(ids,recommendStatus);
    }


}
