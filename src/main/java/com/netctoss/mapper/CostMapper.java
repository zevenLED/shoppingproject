package com.netctoss.mapper;
import com.netctoss.pojo.Cost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostMapper {
    Cost findByCostId(Integer costId);
    List<Cost> findAll();
    boolean updateCost(Cost cost);
    boolean deleteCost(Integer costId);
    boolean changeCost(Integer costId);
    boolean addCost(Cost cost);
//    List<Cost> findByBC();
//    List<Cost> findByBD();
//    void changeStatus(Integer costId);
//    void addCost(Cost cost);
}
