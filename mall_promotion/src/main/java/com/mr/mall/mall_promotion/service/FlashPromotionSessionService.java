package com.mr.mall.mall_promotion.service;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotionSession;
import com.mr.mall.mall_promotion.util.CommonResult;

import java.util.List;

public interface FlashPromotionSessionService {
    CommonResult<List<SmsFlashPromotionSession>> findPromotionSession(Long flashPromotionId);
}
