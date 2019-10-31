package com.mr.mall.mall_commodity.service.impl;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.mapper.PmsProductCategoryMapper;
import com.mr.mall.mall_commodity.service.IPmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PmsProductCategoryServiceImpl
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/31
 * @Version V1.0
 **/
@Service
public class PmsProductCategoryServiceImpl implements IPmsProductCategoryService {

    @Autowired
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public List<PmsProduct> listWithChildren() {
        return pmsProductCategoryMapper.listWithChildren();
    }
}
