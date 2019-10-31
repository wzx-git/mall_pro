package com.mr.mall.mall_promotion.service;

import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtils;


public interface SmsFlashPromotionProductRelationService {
    /*
     * 查询每个活动以及时间段所对应的商品列表
     * @author Administrator
     * @date 2019/10/31
     * @param null
     * @return
     **/
    CommonResult<PageUtils> selectList(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);
}
