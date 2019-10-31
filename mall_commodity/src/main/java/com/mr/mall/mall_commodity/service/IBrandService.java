package com.mr.mall.mall_commodity.service;

import com.mr.mall.mall_commodity.entity.PmsBrand;
import com.mr.mall.mall_commodity.entity.PmsBrandDto;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;

import java.util.List;

public interface IBrandService {
    
    /*               
     * @MethodName: listBrand
     * @Description: TODO
     * @Param: [pageNum, pageSize]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<com.mr.mall.mall_commodity.utils.PageUtils<com.mr.mall.mall_commodity.entity.PmsBrand>>
     * @Author: chen
     * @Date: 2019/10/29
    **/
    CommonResult<PageUtils<PmsBrand>> listBrand(Integer pageNum, Integer pageSize);

    /**               
     * @MethodName: deleteBrand
     * @Description: TODO
     * @Param: [id]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/30
    **/
    CommonResult deleteBrand(Integer id);

    /**               
     * @MethodName: getBrand
     * @Description: TODO
     * @Param: [id]
     * @Return: com.mr.mall.mall_commodity.entity.PmsBrand
     * @Author: chen
     * @Date: 2019/10/30
    **/
    PmsBrand getBrand(Integer id);

    /**               
     * @MethodName: updateBrand
     * @Description: TODO
     * @Param: [id, pmsBrandDto]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/31
    **/
    int updateBrand(Long id, PmsBrandDto pmsBrandDto);

    /**               
     * @MethodName: updateFactoryStatus
     * @Description: TODO
     * @Param: [ids, factoryStatus]
     * @Return: int
     * @Author: chen
     * @Date: 2019/10/31
    **/
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);

    /**               
     * @MethodName: updateShowStatus
     * @Description: TODO
     * @Param: [ids, showStatus]
     * @Return: int
     * @Author: chen
     * @Date: 2019/10/31
    **/
    int updateShowStatus(List<Long> ids, Integer showStatus);
}
