package com.mr.mall.mall_comment.service.ipml;

import com.mr.mall.mall_comment.entity.SmsHomeRecommendProduct;
import com.mr.mall.mall_comment.mapper.SmsHomeRecommendProductMapper;
import com.mr.mall.mall_comment.service.IShrpService;
import com.mr.mall.mall_comment.utils.CommonResult;
import com.mr.mall.mall_comment.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShrpServiceImpl implements IShrpService {

    @Autowired
    private SmsHomeRecommendProductMapper smsHomeRecommendProductMapper;


    /** 
    * @Description: 分页查询，并根据模板的返回格式返回
    * @Param: [smsHomeRecommendProduct, pageSize, pageNum] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/29 
    */ 
    @Override
    public CommonResult<PageUtils<SmsHomeRecommendProduct>> findShrpList(Integer pageSize, Integer pageNum) {
        /*最终返回的数据data，创建一个返回格式的对象*/
        CommonResult<PageUtils<SmsHomeRecommendProduct>> listData = new CommonResult<>();
        /*分页封装的数据，先创建一个分页的对象*/
        PageUtils<SmsHomeRecommendProduct> pageUtils = new PageUtils<>();
        //赋值
        /*每页最大条数*/
        pageUtils.setPageSize(pageSize);
        /*开始页数*/
        pageUtils.setPageNum(pageNum);
        /*开始条数*/
        pageUtils.getStartNum();
        //请求mapper，将分页信息传递
        List<SmsHomeRecommendProduct>  list = smsHomeRecommendProductMapper.findShrpList(pageUtils);
        //将分页好获取到的数据，set到分页工具类中的list的集合返回数据里
        pageUtils.setList(list);
        //获取总条数
        Integer getTotal = smsHomeRecommendProductMapper.getTotal();
        //江总条数赋值
        pageUtils.setTotal(getTotal);
        //获取总页数,总条数比上每页最大条数
        pageUtils.setTotalPage(getTotal/pageSize);
        //将分页信息赋值到返回格式的list
        listData.setData(pageUtils);
        listData.setCode(200);
        listData.setMessage("操作成功");
        return listData;
    }

    /** 
    * @Description: 单独删除和批量删除
    * @Param: [ids] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/29 
    */ 
    @Override
    public CommonResult delete(List<Long> ids) {
        CommonResult comm = new CommonResult();
        Integer count = smsHomeRecommendProductMapper.delete(ids);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }

    /** 
    * @Description: 修改状态值，推荐和未推荐，以及批量修改
    * @Param: [ids, recommendStatus] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/29 
    */ 
    @Override
    public CommonResult updateStatus(List<Long> ids, Integer recommendStatus) {
        CommonResult comm = new CommonResult();
        Map<String,Object> map = new HashMap<>();
        map.put("ids",ids);
        map.put("recommendStatus",recommendStatus);
        Integer count  = smsHomeRecommendProductMapper.updateStatus(map);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }

    /** 
    * @Description: 根据数量修改排序，数量多的排在上方
    * @Param: [id, sort] 
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/31 
    */ 
    @Override
    public CommonResult updateSort(Long id, Integer sort) {
        CommonResult comm = new CommonResult();
        Map<String,Object> params = new HashMap<>();
        params.put("id",id);
        params.put("sort",sort);
        Integer count = smsHomeRecommendProductMapper.updateSort(params);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }

    @Override
    public CommonResult insert(List<SmsHomeRecommendProduct> shrp) {
        CommonResult comm = new CommonResult();
        Integer count = smsHomeRecommendProductMapper.insert(shrp);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }

    /** 
    * @Description: 单独修改
    * @Param:  
    * @return:  
    * @Author: wzx
    * @Date: 2019/10/29 
    */ 
    /*public CommonResult updateStatus1(Long id, Integer recommendStatus) {
        CommonResult comm = new CommonResult();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("ids",id);
        map.put("recommendStatus",recommendStatus);
        Integer count  = smsHomeRecommendProductMapper.updateStatusById(map);
        comm.setData(count);
        comm.setCode(200);
        comm.setMessage("操作成功");
        return comm;
    }*/
}
