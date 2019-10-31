package com.mr.mall.mall_promotion.service;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotion;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtils;

public interface SmsFlashPromotionService {

    CommonResult<PageUtils<SmsFlashPromotion>> findSmsFlashPromotionList(Integer pageNum, Integer pageSize, String keyword);

    CommonResult updatePromotion(Long id, Integer status);
}
