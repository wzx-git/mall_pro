package com.mr.mall.mall_commodity.service.impl;

import com.mr.mall.mall_commodity.entity.PmsBrand;
import com.mr.mall.mall_commodity.entity.PmsBrandDto;
import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.mapper.PmsBrandMapper;
import com.mr.mall.mall_commodity.model.PmsBrandExample;
import com.mr.mall.mall_commodity.service.IBrandService;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BrandServiceImpl
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/29
 * @Version V1.0
 **/
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public CommonResult<PageUtils<PmsBrand>> listBrand(Integer pageNum, Integer pageSize) {

        /*最终返回数据*/
        CommonResult<PageUtils<PmsBrand>>  listData = new CommonResult<>();
        /*分页封装数据*/
        PageUtils<PmsBrand> pageUtils = new PageUtils<>();
        pageUtils.setPageSize(pageSize);
        pageUtils.setPageNum(pageNum);
        pageUtils.getStartNum();
        List<PmsBrand> datalist= pmsBrandMapper.getBrandList(pageUtils);
        pageUtils.setList(datalist);
        /*总条数*/
        Integer total = pmsBrandMapper.getBrandTotal();
        pageUtils.setTotal(total);
        /*总页数*/
        pageUtils.setTotalPage(total/pageSize);
        listData.setData(pageUtils);

        listData.setCode(200);
        listData.setMessage("操作成功");

        return listData;
    }

    @Override
    public CommonResult deleteBrand(Integer id) {

        CommonResult commonResult = new CommonResult<>();
        Integer count = pmsBrandMapper.deleteBrand(id);
        commonResult.setData(count);
        commonResult.setCode(200);
        commonResult.setMessage("成功");
        return commonResult;
    }

    @Override
    public PmsBrand getBrand(Integer id) {
        return pmsBrandMapper.selectBrandById(id);
    }

    @Override
    public int updateBrand(Long id, PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto,pmsBrand);
        pmsBrand.setId(id);
        return pmsBrandMapper.updateBrand(pmsBrand);
    }

    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {

        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setFactoryStatus(factoryStatus);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdIn(ids);

        return pmsBrandMapper.updateFactoryStatus(pmsBrand,pmsBrandExample);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setShowStatus(showStatus);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdIn(ids);
        return pmsBrandMapper.updateFactoryStatus(pmsBrand,pmsBrandExample);
    }


}
