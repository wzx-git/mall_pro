package com.mr.mall.mall_promotion.service.impl;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotionSession;
import com.mr.mall.mall_promotion.mapper.SmsFlashPromotionProductRelationMapper;
import com.mr.mall.mall_promotion.mapper.SmsFlashPromotionSessionMapper;
import com.mr.mall.mall_promotion.service.FlashPromotionSessionService;
import com.mr.mall.mall_promotion.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FlashPromotionSessionServiceImpl implements FlashPromotionSessionService {

    @Autowired
    private SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper;

    @Autowired
    private SmsFlashPromotionProductRelationMapper smsFlashPromotionProductRelationMapper;

    /*
     * 根据活动的id进行查询，并逐次查询每个时间段此活动对应的商品数量
     * @author Administrator
     * @date 2019/10/31
     * @param null
     * @return
     **/
    @Override
    public CommonResult<List<SmsFlashPromotionSession>> findPromotionSession(Long flashPromotionId) {
        CommonResult<List<SmsFlashPromotionSession>> commonResult = new CommonResult<>();
        try {
            List<SmsFlashPromotionSession> list = smsFlashPromotionSessionMapper.findPromotionSession();
            Map<String,Object> map = new HashMap<>();
            for (int i=0;i<list.size();i++){
                map.put("flashPromotionId",flashPromotionId);
                map.put("sessionId",list.get(i).getId());
                Integer count = smsFlashPromotionProductRelationMapper.getCount(map);
                list.get(i).setProductCount(count);
            }
            commonResult.setData(list);

            commonResult.setCode(200);
            commonResult.setMessage("操作成功");
            System.out.println(commonResult);
        }catch (Exception e){
            System.err.println(e);
            commonResult.setCode(500);
            commonResult.setMessage("操作失败，请联系管理员");
        }
        return commonResult;
    }
}
