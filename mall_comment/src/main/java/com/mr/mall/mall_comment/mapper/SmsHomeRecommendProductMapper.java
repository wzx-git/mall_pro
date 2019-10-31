package com.mr.mall.mall_comment.mapper;

import com.mr.mall.mall_comment.entity.SmsHomeRecommendProduct;
import com.mr.mall.mall_comment.utils.PageUtils;

import java.util.List;
import java.util.Map;

public interface SmsHomeRecommendProductMapper {


    List<SmsHomeRecommendProduct> findShrpList(PageUtils<SmsHomeRecommendProduct> pageUtils);


    Integer getTotal();

    Integer delete(List<Long> ids);

    Integer updateStatus(Map<String, Object> map);

    Integer updateSort(Map<String, Object> params);

    Integer insert(List<SmsHomeRecommendProduct> shrp);

    //单独修改
    //Integer updateStatusById(Map<String, Object> map);
}