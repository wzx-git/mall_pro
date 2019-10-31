package com.mr.mall.mall_promotion.service.impl;

import com.mr.mall.mall_promotion.entity.PmsProduct;
import com.mr.mall.mall_promotion.entity.SmsFlashProduct;
import com.mr.mall.mall_promotion.mapper.SmsFlashPromotionProductRelationMapper;
import com.mr.mall.mall_promotion.service.SmsFlashPromotionProductRelationService;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService {

    @Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;


    /*
     * 查询每个活动以及时间段所对应的商品列表
     * @author Administrator
     * @date 2019/10/31
     * @param null
     * @return
     **/
    @Override
    public CommonResult<PageUtils> selectList(Long flashPromotionId , Long flashPromotionSessionId, Integer pageSize, Integer pageNum) {

        Map<String,Object> map = new HashMap<>();
        PageUtils<PmsProduct> pageUtil = new PageUtils<>();
        pageUtil.setPageNum(pageNum);
        pageUtil.setPageSize(pageSize);
        map.put("pageUtil",pageUtil);
        map.put("flashPromotionId",flashPromotionId);
        map.put("flashPromotionSessionId",flashPromotionSessionId);
        List<SmsFlashProduct> list = relationMapper.selectList(map);
        return null;
    }
}
