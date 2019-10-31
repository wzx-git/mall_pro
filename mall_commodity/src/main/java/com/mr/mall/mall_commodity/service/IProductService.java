package com.mr.mall.mall_commodity.service;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;

import java.util.List;

public interface IProductService {
    
    /**               
     * @MethodName: getList
     * @Description: TODO
     * @Param: [pageSize, pageNum]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<com.mr.mall.mall_commodity.utils.PageUtils<com.mr.mall.mall_commodity.entity.PmsProduct>>
     * @Author: chen
     * @Date: 2019/10/29
    **/
    CommonResult<PageUtils<PmsProduct>> getList(Integer pageSize, Integer pageNum);


    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    int updateNewStatus(List<Long> ids, Integer newStatus);

    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);
}
