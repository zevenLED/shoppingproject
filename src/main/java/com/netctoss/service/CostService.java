package com.netctoss.service;

import com.github.pagehelper.PageInfo;
import com.netctoss.pojo.Cost;

public interface CostService {
    Cost findByCostId(Integer costId);
    PageInfo findByPage(int pageNum);
    boolean updateCost(Cost cost);
    boolean deleteCost(Integer costId);
    boolean changeCost(Integer costId);
    boolean addcost(Cost cost);
}
