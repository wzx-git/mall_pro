package com.mr.mall.mall_commodity.mapper;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.entity.PmsProductCategory;

import java.util.List;

public interface PmsProductCategoryMapper {

    List<PmsProduct> listWithChildren();
}