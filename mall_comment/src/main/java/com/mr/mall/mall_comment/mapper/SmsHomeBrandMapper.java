package com.mr.mall.mall_comment.mapper;

import com.mr.mall.mall_comment.entity.SmsHomeBrand;
import com.mr.mall.mall_comment.utils.PageUtils;

import java.util.List;

public interface SmsHomeBrandMapper {
    List<SmsHomeBrand> findHomeBrand(PageUtils<SmsHomeBrand> page);

    Integer getTotal();

    Integer deletes(List<Long> ids);


    /*int findTotalNum(SmsHomeBrand shb);*/

   /* List<SmsHomeBrand> findEmployeeList(SmsHomeBrand shb);*/

    
}