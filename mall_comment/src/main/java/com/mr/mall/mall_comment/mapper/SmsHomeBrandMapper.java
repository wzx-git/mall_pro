package com.mr.mall.mall_comment.mapper;

import com.mr.mall.mall_comment.entity.SmsHomeBrand;
import com.mr.mall.mall_comment.utils.PageUtils;

import java.util.List;
import java.util.Map;

public interface SmsHomeBrandMapper {
    List<SmsHomeBrand> findHomeBrand(PageUtils<SmsHomeBrand> page);

    Integer getTotal();

    Integer deletes(List<Long> ids);

    Integer updateSort(Map<String, Object> params);

    Integer updateStatus(Map<String, Object> map);


    /*int findTotalNum(SmsHomeBrand shb);*/

   /* List<SmsHomeBrand> findEmployeeList(SmsHomeBrand shb);*/

    
}