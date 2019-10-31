package com.mr.mall.mall_promotion.mapper;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotionSession;

import java.util.List;

public interface SmsFlashPromotionSessionMapper {

    List<SmsFlashPromotionSession> findPromotionSession();
}