package com.mr.mall.mall_order.service.impl;

import com.mr.mall.mall_order.entity.OrderVO;
import com.mr.mall.mall_order.mapper.IOrderMapper;
import com.mr.mall.mall_order.service.IOrderService;
import com.mr.mall.mall_order.util.CommonResult;
import com.mr.mall.mall_order.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired(required = false)
    private IOrderMapper orderMapper;


    @Override
    public CommonResult<PageUtils<OrderVO>> getOrderList(Integer pageSize, Integer pageNum) {



        /*最终返回的数据data，创建一个返回格式的对象*/
        CommonResult<PageUtils<OrderVO>> listData = new CommonResult<>();
        /*分页封装的数据，先创建一个分页的对象*/
        PageUtils<OrderVO> pageUtils = new PageUtils<>();
        //赋值
        /*每页最大条数*/
        pageUtils.setPageSize(pageSize);
        /*开始页数*/
        pageUtils.setPageNum(pageNum);
        /*开始条数*/
        pageUtils.getStartNum();
        //获取总条数
        Integer getTotal = orderMapper.getTotal();

        //请求mapper，将分页信息传递
        List<OrderVO> list = orderMapper.getOrderList(pageUtils);
        //将分页好获取到的数据，set到分页工具类中的list的集合返回数据里
        pageUtils.setList(list);

        //江总条数赋值
        pageUtils.setTotal(getTotal);
        //获取总页数,总条数比上每页最大条数
        pageUtils.setTotalPage(getTotal/pageSize);
        //将分页信息赋值到返回格式的list
        listData.setData(pageUtils);
        listData.setCode(200);
        listData.setMessage("操作成功");

        return listData;
    }

    /**
     * pia批量删除订单/删除订单
     * @param ids
     * @return
     */
    @Override
    public CommonResult deleteOrderByIds(List<Long> ids) {
        CommonResult comm = new CommonResult();
        Integer count = orderMapper.deleteOrderByIds(ids);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }
}
