package com.mr.mall.mall_promotion.service;

import com.mr.mall.mall_promotion.entity.Center;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtil;

/**
 * Created by Happy on 2019/10/28.
 */
public interface CenterService {

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    CommonResult<PageUtil<Center>> getList(Integer pageNum, Integer pageSize);
}
