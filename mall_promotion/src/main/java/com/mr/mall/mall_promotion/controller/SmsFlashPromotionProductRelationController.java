package com.mr.mall.mall_promotion.controller;

import com.mr.mall.mall_promotion.service.SmsFlashPromotionProductRelationService;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flashProductRelation")
public class SmsFlashPromotionProductRelationController {

    @Autowired
    private SmsFlashPromotionProductRelationService flashPromotionRelationService;

    /*
     * 查询每个活动以及时间段所对应的商品列表
     * @author Administrator
     * @date 2019/10/31
     * @param null
     * @return
     **/
    @RequestMapping("/selectList")
    public CommonResult<PageUtils> selectList(@RequestParam(value = "flashPromotionId") Long flashPromotionId,
                                              @RequestParam(value = "flashPromotionSessionId") Long flashPromotionSessionId,
                                              @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        CommonResult<PageUtils> commonResult = flashPromotionRelationService.selectList(flashPromotionId,flashPromotionSessionId,pageSize,pageNum);
        return null;
    }



}
