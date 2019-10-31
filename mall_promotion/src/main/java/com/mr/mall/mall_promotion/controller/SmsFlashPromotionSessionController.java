package com.mr.mall.mall_promotion.controller;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotionSession;
import com.mr.mall.mall_promotion.service.FlashPromotionSessionService;
import com.mr.mall.mall_promotion.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flashSession")
public class SmsFlashPromotionSessionController {

    @Autowired
    private FlashPromotionSessionService flashPromotionSessionService;

    /*
     * 查询活动时间列表
     * @author Administrator
     * @date 2019/10/30
     * @param null
     * @return
     **/
    @GetMapping("/selectList")
    public CommonResult<List<SmsFlashPromotionSession>> findPromotionSession(Long flashPromotionId){
        return flashPromotionSessionService.findPromotionSession(flashPromotionId);
    }
}
