package com.netctoss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netctoss.mapper.CostMapper;
import com.netctoss.pojo.Cost;
import com.netctoss.service.CostService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostServiceImpl implements CostService {

    @Resource
    private CostMapper costMapper;
    private int pageSize = 4;
    private int navigatePages=3;
    @Override
    public Cost findByCostId(Integer costId) {
        return costMapper.findByCostId(costId);
    }

    @Override
    public PageInfo findByPage(int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cost> costs=costMapper.findAll();
        PageInfo pageInfo=new PageInfo(costs,navigatePages);
        return pageInfo;
    }
    public boolean updateCost(Cost cost) {
         return costMapper.updateCost(cost);
    }
    public boolean deleteCost(Integer costId) {
        return costMapper.deleteCost(costId);
    }
    public boolean changeCost(Integer id) {
        return costMapper.changeCost(id);
    }

    @Override
    public boolean addcost(Cost cost) {
        return costMapper.addCost(cost);
    }
}
