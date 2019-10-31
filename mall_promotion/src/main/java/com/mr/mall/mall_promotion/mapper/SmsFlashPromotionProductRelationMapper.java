package com.mr.mall.mall_promotion.mapper;

import com.mr.mall.mall_promotion.entity.SmsFlashProduct;

import java.util.List;
import java.util.Map;

public interface SmsFlashPromotionProductRelationMapper {

    Integer getCount(Map<String, Object> map);

    List<SmsFlashProduct> selectList(Map<String, Object> map);
}