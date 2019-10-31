package com.mr.mall.mall_commodity.mapper;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.entity.PmsProductWithBLOBs;
import com.mr.mall.mall_commodity.utils.PageUtils;
import com.mr.mall.mall_commodity.utils.PmsProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductMapper {

    /*查询每页条数*/
    List<PmsProduct> findPmsProductList(PageUtils<PmsProduct> pageUtils);

    /*查询总条数*/
    Integer getTotal();

    int updateByExampleSelective(@Param ("record") PmsProduct record, @Param("example") PmsProductExample example);
}