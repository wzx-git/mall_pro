package com.mr.mall.mall_commodity.mapper;

import com.mr.mall.mall_commodity.entity.PmsBrand;
import com.mr.mall.mall_commodity.model.PmsBrandExample;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBrandMapper {

    List<PmsBrand> getBrandList(PageUtils pageUtils);

    int getBrandTotal();

    Integer deleteBrand(Integer id);

    PmsBrand selectBrandById(Integer id);

    int updateBrand(PmsBrand pmsBrand);

    int updateFactoryStatus(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

}