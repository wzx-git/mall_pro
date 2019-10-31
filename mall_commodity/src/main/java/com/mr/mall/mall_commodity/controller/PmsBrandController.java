package com.mr.mall.mall_commodity.controller;

import com.mr.mall.mall_commodity.entity.PmsBrand;
import com.mr.mall.mall_commodity.entity.PmsBrandDto;
import com.mr.mall.mall_commodity.service.IBrandService;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName PmsBrandController
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/29
 * @Version V1.0
 **/
@Controller
@RequestMapping("brand")
public class PmsBrandController {

    @Autowired
    private IBrandService brandService;

    /**
     * @MethodName: updateShowStatus  批量更新显示状态
     * @Description: TODO
     * @Param: [ids, showStatus]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/31
    **/
    @PostMapping("/update/showStatus")
    @ResponseBody
    public CommonResult updateShowStatus(@RequestParam("ids") List<Long> ids,
                                         @RequestParam("showStatus") Integer showStatus) {
        int count = brandService.updateShowStatus(ids, showStatus);
        if(count>0){
            CommonResult.success(200);
        }
        return  CommonResult.success(500);
    }

    /*
     * @MethodName: updateFactoryStatus  批量更新厂家制造商状态
     * @Description: TODO
     * @Param: [ids, factoryStatus]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/31
    **/
    @PostMapping(value = "/update/factoryStatus")
    @ResponseBody
    public CommonResult updateFactoryStatus(@RequestParam("ids") List<Long> ids,
                                            @RequestParam("factoryStatus") Integer factoryStatus) {
        int count = brandService.updateFactoryStatus(ids, factoryStatus);
            if(count>0){
                CommonResult.success(200);
            }
        return  CommonResult.success(500);
    }


    /**               
     * @MethodName: updateBrand
     * @Description: TODO
     * @Param: [id, pmsBrandDto, result]
     * @Return: int
     * @Author: chen
     * @Date: 2019/10/30
    **/
    @PostMapping(value = "/update/{id}")
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandDto pmsBrandDto, BindingResult result) {

        int count  = brandService.updateBrand(id,pmsBrandDto);
        if(count==1){
            CommonResult.success(count);
        }
        return CommonResult.success(500);
    }

    /**               
     * @MethodName: brand
     * @Description: TODO
     * @Param: [id]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<com.mr.mall.mall_commodity.entity.PmsBrand>
     * @Author: chen
     * @Date: 2019/10/30
    **/
    @RequestMapping("/selectInfo/{id}")
    @ResponseBody
    public CommonResult<PmsBrand> brand(@PathVariable("id") Integer id) {
        return CommonResult.success(brandService.getBrand(id));
    }


    /**               
     * @MethodName: deleteBrand
     * @Description: TODO
     * @Param: [id]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult
     * @Author: chen
     * @Date: 2019/10/30
    **/
    @GetMapping("/delete/{id}")
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Integer id) {
        return brandService.deleteBrand(id);
    }

    /**               
     * @MethodName: listBrand
     * @Description: TODO
     * @Param: [pageNum, pageSize]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<com.mr.mall.mall_commodity.utils.PageUtils<com.mr.mall.mall_commodity.entity.PmsBrand>>
     * @Author: chen
     * @Date: 2019/10/29
    **/
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<PageUtils<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                       @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize){

        CommonResult<PageUtils<PmsBrand>> brandData = brandService.listBrand(pageNum,pageSize);
        System.err.println(brandData);
        return brandData;
    }

}
