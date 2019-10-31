package com.mr.mall.mall_commodity.controller;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.service.IProductService;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PmsProductController
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/28
 * @Version V1.0
 **/
@Controller
@RequestMapping("pmsProduct")
public class PmsProductController {
/*@CrossOrigin(origins ="http://localhost:8766+", maxAge = 3600)*/

    @Autowired
    private IProductService productService;

    
    
    /**               
     * @MethodName: updateRecommendStatus  批量推荐商品
     * @Description: TODO
     * @Param: [ids, recommendStatus]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/31
    **/
    @PostMapping("/update/recommendStatus")
    @ResponseBody
    public CommonResult updateRecommendStatus(@RequestParam("ids") List<Long> ids,
                                              @RequestParam("recommendStatus") Integer recommendStatus) {
        int count = productService.updateRecommendStatus(ids, recommendStatus);
        if (count>0){
            CommonResult.success(200);
        }
        return CommonResult.success(500);
    }


    /**               
     * @MethodName: updateNewStatus   批量设为新品
     * @Description: TODO
     * @Param: [ids, newStatus]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/31
    **/
    @PostMapping("/update/newStatus")
    @ResponseBody
    public CommonResult updateNewStatus(@RequestParam("ids") List<Long> ids,
                                        @RequestParam("newStatus") Integer newStatus) {
        int count = productService.updateNewStatus(ids, newStatus);
        if (count>0){
            CommonResult.success(200);
        }
        return CommonResult.success(500);
    }


    /**
     * @MethodName: updatePublishStatus  批量上下架
     * @Description: TODO
     * @Param: [ids, publishStatus]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/31
    **/
    @PostMapping("/update/publishStatus")
    @ResponseBody
    public CommonResult updatePublishStatus(@RequestParam("ids") List<Long> ids,
                                            @RequestParam("publishStatus") Integer publishStatus) {
        int count = productService.updatePublishStatus(ids, publishStatus);

        if (count>0){
            CommonResult.success(200);
        }
        return CommonResult.success(500);
    }


    /**               
     * @MethodName: getList 商品查询
     * @Description: TODO
     * @Param: [pmsProduct, pageSize, pageNum]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<com.mr.mall.mall_commodity.utils.PageUtils<com.mr.mall.mall_commodity.entity.PmsProduct>>
     * @Author: chen
     * @Date: 2019/10/29
    **/
    @ResponseBody
    @GetMapping("/FindPmsProductList")
    public CommonResult<PageUtils<PmsProduct>> getList(PmsProduct pmsProduct,
                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){

        CommonResult<PageUtils<PmsProduct>> retData= productService.getList(pageSize,pageNum);
        System.err.println(retData);
        return retData;
    }

    /*
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:product:read')")
    public CommonResult<CommonPage<PmsProduct>> getList(PmsProductQueryParam productQueryParam,
                                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = productService.list(productQueryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(productList));
    }*/



    @GetMapping("test")
    public String test(){
        System.err.println("12345789");
        return "test";
    }

}
