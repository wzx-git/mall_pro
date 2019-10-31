package com.mr.mall.mall_comment.service.ipml;

import com.mr.mall.mall_comment.entity.SmsHomeBrand;
import com.mr.mall.mall_comment.mapper.SmsHomeBrandMapper;
import com.mr.mall.mall_comment.service.ISmsHomeBrandService;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XuanAndWang on 2019/10/26.
 */
@Service
public class SmsHomeBrandServiceImpl implements ISmsHomeBrandService {

    @Autowired
    private SmsHomeBrandMapper smsHomeBrandMapper;


    @Override
    public CommonResult<PageUtils<SmsHomeBrand>> findHomeBrand(Integer pageSize, Integer pageNum) {
         /*最终返回数据*/
        CommonResult<PageUtils<SmsHomeBrand>> listData = new CommonResult<>();
         /*分页封装数据*/
        PageUtils<SmsHomeBrand> page = new PageUtils<>();
        page.setPageSize(pageSize);
        page.setPageNum(pageNum);
        page.getStartNum();
        List<SmsHomeBrand> list = smsHomeBrandMapper.findHomeBrand(page);
        page.setList(list);
        /*总条数*/
        Integer total =  smsHomeBrandMapper.getTotal();
        page.setTotal(total);
         /*总页数*/
        page.setTotalPage(total/pageSize);
        listData.setData(page);
        listData.setCode(200);
        listData.setMessage("操作成功");
        return listData;
    }

    @Override
    public CommonResult deletes(List<Long> ids) {
        CommonResult comm = new CommonResult();
        Integer count = smsHomeBrandMapper.deletes(ids);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }
}
