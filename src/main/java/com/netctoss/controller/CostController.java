package com.netctoss.controller;

import com.github.pagehelper.PageInfo;
import com.netctoss.pojo.Cost;
import com.netctoss.service.CostService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("fee")
public class CostController {
//    @RequestMapping("findByPage")
//    public String findByPage() {
//        return "fee/fee_list";
//    }
    @Resource
    private CostService costService;
    @RequestMapping("findByPage")
    public ModelAndView findByPage(Integer pageNum, ModelAndView mav) {
        if (StringUtils.isEmpty(pageNum)){
            pageNum=1;
        }
        PageInfo pageInfo=costService.findByPage(pageNum);
        System.out.println(pageInfo);
        mav.setViewName("fee/fee_list");
        mav.addObject("pageInfo", pageInfo);
        return mav;
    }
    @RequestMapping("index")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("toaddcost")
    public ModelAndView toaddcost(ModelAndView mav) {
        Cost cost = new Cost();
        mav.setViewName("fee/fee_add");
        mav.addObject("cost", cost);
        return mav;
    }
    @RequestMapping("addcost")
    public ModelAndView addcost(Cost cost,ModelAndView mav) {
        costService.addcost(cost);
        mav.setViewName("redirect:findByPage");
        return mav;
    }
    @RequestMapping("findById")
    public ModelAndView findByCostId(Integer costId, ModelAndView mav) {
        Cost cost=costService.findByCostId(costId);
        mav.setViewName("fee/fee_detail");
        mav.addObject("cost", cost);
        return mav;
    }
    @RequestMapping("toupdateCost")
    public ModelAndView toupdateCost(Integer costId,int page, ModelAndView mav) {
        Cost cost=costService.findByCostId(costId);
        mav.setViewName("fee/fee_modi");
        mav.addObject("cost", cost);
        mav.addObject("page", page);
        return mav;
    }
    @RequestMapping("updateCost")
    public ModelAndView updateCost(Cost cost,int page, ModelAndView mav) {
        costService.updateCost(cost);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }
    @RequestMapping("deleteCost")
    public ModelAndView deleteCost(int id,int page, ModelAndView mav) {
        costService.deleteCost(id);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }
    @RequestMapping("changeCost")
    public ModelAndView changeCost(Integer id,int page, ModelAndView mav) {
        costService.changeCost(id);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }
}
