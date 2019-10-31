package com.mr.mall.mall_comment.service;

import com.mr.mall.mall_comment.entity.SmsHomeBrand;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;

import java.util.List;

/**
 * Created by XuanAndWang on 2019/10/26.
 */
public interface ISmsHomeBrandService {


    CommonResult<PageUtils<SmsHomeBrand>> findHomeBrand(Integer pageSize, Integer pageNum);


    CommonResult deletes(List<Long> ids);


    CommonResult updateSort(Long id, Integer sort);

    CommonResult updateStatus(List<Long> ids, Integer recommendStatus);
}
