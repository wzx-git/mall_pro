package com.mr.mall.mall_order.controller;

import com.mr.mall.mall_order.entity.OrderVO;
import com.mr.mall.mall_order.service.IOrderService;
import com.mr.mall.mall_order.util.CommonResult;
import com.mr.mall.mall_order.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**
     * 订单列表查询
     * @param pageSize
     * @param pageNum
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list")
    public CommonResult<PageUtils<OrderVO>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){

        CommonResult<PageUtils<OrderVO>> list =  orderService.getOrderList(pageSize,pageNum);
        return list;
    }


    /**
     * 删除订单/批量删除u
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public CommonResult deleteOrderByIds(@RequestParam("ids") List<Long> ids){
         return  orderService.deleteOrderByIds(ids);
    }







}

