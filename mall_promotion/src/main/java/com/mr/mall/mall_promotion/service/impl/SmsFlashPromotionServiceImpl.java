package com.mr.mall.mall_promotion.service.impl;

import com.mr.mall.mall_promotion.entity.SmsFlashPromotion;
import com.mr.mall.mall_promotion.mapper.SmsFlashPromotionMapper;
import com.mr.mall.mall_promotion.service.SmsFlashPromotionService;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService {
    @Autowired
    private SmsFlashPromotionMapper smsFlashPromotionMapper;

    /*
     * 展示抢购活动数据
     * @author Administrator
     * @date 2019/10/29
     * @param null
     * @return
     **/
    @Override
    public CommonResult<PageUtils<SmsFlashPromotion>> findSmsFlashPromotionList(Integer pageNum, Integer pageSize , String keyword) {
        /*最终返回数据*/
        CommonResult<PageUtils<SmsFlashPromotion>>  listData =new CommonResult<>();
        /*分页封装数据*/
        PageUtils<SmsFlashPromotion> pageUtils = new PageUtils<>();
        try {

            pageUtils.setPageSize(pageSize);
            pageUtils.setPageNum(pageNum);
            Map<String,Object> map = new HashMap<>();
            map.put("page",pageUtils);
            map.put("keyword",keyword);
            List<SmsFlashPromotion> list= smsFlashPromotionMapper.findSmsFlashPromotionList(map);
            pageUtils.setList(list);
            /*总条数*/
            Integer total = smsFlashPromotionMapper.getTotal(keyword);
            pageUtils.setTotal(total);
            /*总页数*/
            pageUtils.setTotalPage(total/pageSize);
            listData.setData(pageUtils);
            listData.setCode(200);
            listData.setMessage("操作成功");
        }catch (Exception e){
            listData.setCode(500);
            listData.setMessage("操作失败请联系管理员");
            System.err.println(e);
        }
        return listData;
    }

    @Override
    public CommonResult updatePromotion(Long id, Integer status) {
        CommonResult commonResult = new CommonResult();
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id",id);
            map.put("status",status);
            Integer count = smsFlashPromotionMapper.updatePromotion(map);
            commonResult.setCode(200);
            commonResult.setMessage("操作成功");
            commonResult.setData(count);
        }catch (Exception e){
            commonResult.setCode(500);
            commonResult.setMessage("后台错误请联系管理员");
            System.err.println(e);
        }
        return commonResult;
    }
}
