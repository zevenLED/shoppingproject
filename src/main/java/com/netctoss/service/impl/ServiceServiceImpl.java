package com.netctoss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netctoss.mapper.ServiceMapper;
import com.netctoss.pojo.SearchCondition;
import com.netctoss.pojo.Service;
import com.netctoss.service.ServiceService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceServiceImpl implements ServiceService {
    @Resource
    private ServiceMapper serviceMapper;
    private int pageSize = 2;
    private int navigatePages=3;

    @Override
    public PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Service> services = serviceMapper.findByPageAndCondition(condition);
        PageInfo pageInfo = new PageInfo(services,navigatePages);
        return pageInfo;
    }

    @Override
    public boolean change(Integer serviceId) {
        return serviceMapper.change(serviceId);
    }

    @Override
    public boolean delete(Integer serviceId) {
        return serviceMapper.delete(serviceId);
    }

    @Override
    public Service findById(Integer serviceId) {
        return serviceMapper.findById(serviceId);
    }

    @Override
    public boolean update(Service service) {
        return serviceMapper.update(service);
    }

    @Override
    public boolean add(Service service) {
        return serviceMapper.add(service);
    }

    @Override
    public Service findByidcardNo(String idcardNo) {
        return serviceMapper.findByidcardNo(idcardNo);
    }
}
