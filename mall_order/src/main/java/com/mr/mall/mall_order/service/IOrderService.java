package com.mr.mall.mall_order.service;

import com.mr.mall.mall_order.entity.OrderVO;
import com.mr.mall.mall_order.util.CommonResult;
import com.mr.mall.mall_order.util.PageUtils;

import java.util.List;

public interface IOrderService {
    CommonResult<PageUtils<OrderVO>> getOrderList(Integer pageSize, Integer pageNum);

    CommonResult deleteOrderByIds(List<Long> ids);
}
