package com.mr.mall.mall_promotion.service.impl;

import com.mr.mall.mall_promotion.entity.Center;
import com.mr.mall.mall_promotion.mapper.CenterMapper;
import com.mr.mall.mall_promotion.service.CenterService;
import com.mr.mall.mall_promotion.util.CommonResult;
import com.mr.mall.mall_promotion.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Happy on 2019/10/28.
 */
@Service
public class CenterServiceImpl implements CenterService{
    @Autowired
    private CenterMapper centerMapper;
    @Override
    public CommonResult<PageUtil<Center>> getList(Integer pageNum, Integer pageSize) {

        /*创建最终返回格式*/
        CommonResult cr = new CommonResult();

        PageUtil pageUtil = new PageUtil();
        pageUtil.setPageNum(pageNum);
        pageUtil.setPageSize(pageSize);
        pageUtil.getStartNum();

        /*查询每页条数*/
        List<Center> list = centerMapper.getList(pageUtil);
        pageUtil.setList(list);

        /*查询总条数*/
        int total = centerMapper.getTotal();
        pageUtil.setTotal(total);

        pageUtil.setTotalPage(total/pageSize);

        cr.setCode(200);
        cr.setMessage("操作成功");
        cr.setData(pageUtil);
        return cr;
    }
}
