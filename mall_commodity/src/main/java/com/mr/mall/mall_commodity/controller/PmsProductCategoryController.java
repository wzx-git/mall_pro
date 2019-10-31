package com.mr.mall.mall_commodity.controller;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.service.IPmsProductCategoryService;
import com.mr.mall.mall_commodity.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName PmsProductCategory
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/31
 * @Version V1.0
 **/
@Controller
@RequestMapping("/category")
public class PmsProductCategoryController {

    @Autowired
    private IPmsProductCategoryService pmsProductCategoryService;


    /**
     * @MethodName: listWithChildren  查询所有一级分类及子分类
     * @Description: TODO
     * @Param: []
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<List<PmsProductCategoryWithChildrenItem>>
     * @Author: chen
     * @Date: 2019/10/31
    **/
    @GetMapping("/list/withChildren")
    @ResponseBody
    public CommonResult<List<PmsProduct>> listWithChildren() {
        List<PmsProduct> list = pmsProductCategoryService.listWithChildren();
        return CommonResult.success(list);
    }

}
