package com.mr.mall.mall_comment.service;

import com.mr.mall.mall_comment.entity.SmsHomeRecommendProduct;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;

import java.util.List;

public interface IShrpService {


    CommonResult<PageUtils<SmsHomeRecommendProduct>> findShrpList(Integer pageSize, Integer pageNum);

    CommonResult delete(List<Long> ids);

    CommonResult updateStatus(List<Long> ids, Integer recommendStatus);

    CommonResult updateSort(Long id, Integer sort);

    CommonResult insert(List<SmsHomeRecommendProduct> shrp);
}
