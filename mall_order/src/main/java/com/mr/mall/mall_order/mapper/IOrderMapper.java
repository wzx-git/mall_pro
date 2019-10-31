package com.mr.mall.mall_order.mapper;

import com.mr.mall.mall_order.entity.OrderVO;
import com.mr.mall.mall_order.util.PageUtils;

import java.util.List;

public interface IOrderMapper {
    List<OrderVO> getOrderList(PageUtils<OrderVO> pageUtils);

    Integer getTotal();

    List<OrderVO> findOrderList();

    Integer deleteOrderByIds(List<Long> ids);
}
