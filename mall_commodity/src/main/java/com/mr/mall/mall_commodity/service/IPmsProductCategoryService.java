package com.mr.mall.mall_commodity.service;

import com.mr.mall.mall_commodity.entity.PmsProduct;

import java.util.List;

public interface IPmsProductCategoryService {

    /*查询所有一级分类及子分类*/
    List<PmsProduct> listWithChildren();
}
