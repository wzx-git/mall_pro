package com.mr.mall.mall_promotion.controller;

import com.mr.mall.mall_promotion.entity.Center;
import com.mr.mall.mall_promotion.service.CenterService;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Happy on 2019/10/28.
 */
@Controller
@RequestMapping("/center")
public class CenterController {
    @Autowired
    private CenterService centerService;

    /**
     * 分页查询
     * @param pageSize
     * @param pageNum
     * @return
     */
    @GetMapping("/centerList")
    @ResponseBody
    public CommonResult<PageUtil<Center>>centerList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        CommonResult<PageUtil<Center>> data = centerService.getList(pageNum,pageSize);
        return data;
    }
}
