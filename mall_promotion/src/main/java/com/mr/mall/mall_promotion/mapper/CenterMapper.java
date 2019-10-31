package com.mr.mall.mall_promotion.mapper;

import com.mr.mall.mall_promotion.entity.Center;
import com.mr.mall.mall_promotion.util.PageUtil;

import java.util.List;

/**
 * Created by Happy on 2019/10/28.
 */
public interface CenterMapper {

    /*查询每页条数*/
    List<Center> getList(PageUtil pageUtil);

    /*查询总条数*/
    int getTotal();
}
