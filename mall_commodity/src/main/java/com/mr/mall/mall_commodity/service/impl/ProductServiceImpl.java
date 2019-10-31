package com.mr.mall.mall_commodity.service.impl;

import com.mr.mall.mall_commodity.entity.PmsProduct;
import com.mr.mall.mall_commodity.mapper.PmsProductMapper;
import com.mr.mall.mall_commodity.service.IProductService;
import com.mr.mall.mall_commodity.utils.CommonResult;
import com.mr.mall.mall_commodity.utils.PageUtils;
import com.mr.mall.mall_commodity.utils.PmsProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description: TODO
 * @Author chen
 * @Date 2019/10/28
 * @Version V1.0
 **/
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private PmsProductMapper productMapper;


    /**               
     * @MethodName: getList
     * @Description: TODO
     * @Param: [pageSize, pageNum]
     * @Return: com.mr.mall.mall_commodity.utils.CommonResult<com.mr.mall.mall_commodity.utils.PageUtils<com.mr.mall.mall_commodity.entity.PmsProduct>>
     * @Author: chen
     * @Date: 2019/10/29
    **/
    @Override
    public CommonResult<PageUtils<PmsProduct>> getList(Integer pageSize, Integer pageNum) {
        /*最终返回数据*/
        CommonResult<PageUtils<PmsProduct>>  listData = new CommonResult<>();
        /*分页封装数据*/
        PageUtils<PmsProduct> pageUtils = new PageUtils<>();
        pageUtils.setPageSize(pageSize);
        pageUtils.setPageNum(pageNum);
        pageUtils.getStartNum();
        List<PmsProduct> list= productMapper.findPmsProductList(pageUtils);
        pageUtils.setList(list);
        /*总条数*/
        Integer total = productMapper.getTotal();
        pageUtils.setTotal(total);
        /*总页数*/
        pageUtils.setTotalPage(total/pageSize);
        listData.setData(pageUtils);

        listData.setCode(200);
        listData.setMessage("操作成功");

        return listData;
    }

    @Override
    public int updatePublishStatus(List<Long> ids, Integer publishStatus) {
        PmsProduct record = new PmsProduct();
        record.setPublishStatus(publishStatus);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andIdIn(ids);
        return productMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateNewStatus(List<Long> ids, Integer newStatus) {
        PmsProduct record = new PmsProduct();
        record.setPublishStatus(newStatus);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andIdIn(ids);
        return productMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        PmsProduct record = new PmsProduct();
        record.setPublishStatus(recommendStatus);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andIdIn(ids);
        return productMapper.updateByExampleSelective(record, example);
    }


}
