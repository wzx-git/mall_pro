package com.mr.mall.mall_promotion.controller;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotion;
import com.mr.mall.mall_promotion.service.SmsFlashPromotionService;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flashPromotion")
/*@CrossOrigin("http://localhost:8090")*/
public class SmsFlashPromotionController {
    @Autowired
    private SmsFlashPromotionService smsFlashPromotionService;

    /*
     * 展示秒杀状态
     * @author Administrator
     * @date 2019/10/29
     * @param null
     * @return
     **/
    @GetMapping("/findSmsFlashPromotionList")
    public CommonResult<PageUtils<SmsFlashPromotion>> findSmsFlashPromotionList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                                @RequestParam(value = "keyword", required = false) String keyword){
        CommonResult<PageUtils<SmsFlashPromotion>> retData = smsFlashPromotionService.findSmsFlashPromotionList(pageNum,pageSize,keyword);
        return retData;
    }
    /*id,status 状态值*/
    /*
     * 修改秒杀抢购的状态值
     * @author Administrator
     * @date 2019/10/29
     * @param id
     * @param status
     * @return
     **/
    @ResponseBody
    @RequestMapping(value = "/updatePromotion/status/{id}", method = RequestMethod.POST)
    public CommonResult updatePromotion(@PathVariable Long id, Integer status){
        CommonResult commonResult = smsFlashPromotionService.updatePromotion(id,status);
        return commonResult;
    }



}
