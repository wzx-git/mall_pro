package com.mr.mall.mall_comment.controller;

import com.mr.mall.mall_comment.entity.SmsHomeRecommendProduct;
import com.mr.mall.mall_comment.service.IShrpService;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shrp")
public class ShrpController {
    @Autowired
    private IShrpService shrpSer;

    /** 
    * @Description: 分页查询，人气推荐商品表
    * @Param: [pageSize, pageNum, smsHomeRecommendProduct] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/29 
    */ 
    @RequestMapping("/findShrpList")
    @ResponseBody
    public CommonResult<PageUtils<SmsHomeRecommendProduct>> findShrpList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                         SmsHomeRecommendProduct smsHomeRecommendProduct){
        CommonResult<PageUtils<SmsHomeRecommendProduct>> retData = shrpSer.findShrpList(pageSize,pageNum);
        System.out.println(retData);
        return retData;
    }


    /** 
    * @Description: 单独删除和批量删除的方法
    * @Param: [ids] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/29 
    */ 
    @RequestMapping("/delete")
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<Long> ids){
        return shrpSer.delete(ids);
    }


    /** 
    * @Description: 修改是否推荐 ，单挑推荐，批量推荐没出来效果
    * @Param: [ids, recommendStatus] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/31 
    */ 
    @ResponseBody
    @RequestMapping("/updateStatus")
    public CommonResult updateStatus(@RequestParam("ids") List<Long> ids,@RequestParam Integer recommendStatus){
        return shrpSer.updateStatus(ids,recommendStatus);
    }


    /** 
    * @Description: 修改排序状态，修改数量后，数量多的排在上方
    * @Param: [id, sort] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/31 
    */
    @ResponseBody
    @PostMapping("/updateSort/{id}")
    public CommonResult updateSort(@PathVariable Long id,Integer sort){
        return shrpSer.updateSort(id,sort);
    }


    /** 
    * @Description: 添加商品 没做完 
    * @Param: [shrp] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/31 
    */ 
    @ResponseBody
    @PostMapping("/insert")
    public CommonResult insert(@RequestBody List<SmsHomeRecommendProduct> shrp){
        return shrpSer.insert(shrp);
    }
}
