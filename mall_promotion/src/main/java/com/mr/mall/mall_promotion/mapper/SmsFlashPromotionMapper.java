package com.mr.mall.mall_promotion.mapper;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotion;

import java.util.List;
import java.util.Map;

public interface SmsFlashPromotionMapper {

    List<SmsFlashPromotion> findSmsFlashPromotionList(Map map);

    Integer getTotal(String keyword);

    Integer updatePromotion(Map<String, Object> map);
}