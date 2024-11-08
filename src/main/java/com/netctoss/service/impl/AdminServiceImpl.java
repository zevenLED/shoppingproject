package com.netctoss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.netctoss.mapper.AdminMapper;
import com.netctoss.pojo.Admin;
import com.netctoss.pojo.SearchCondition;
import com.netctoss.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    private int pageSize = 5;
    private int navigatePages=3;
    @Override
    public Admin Checklogin(Admin admin) {
       return adminMapper.Checklogin(admin);
    }

    @Override
    public Admin Checklogin2(Admin admin) {
        return adminMapper.Checklogin2(admin);
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    @Override
    public boolean updatePassword(Admin admin) {
        return adminMapper.updatepassword(admin);
    }

    @Override
    public PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Admin> list = adminMapper.findByPageAndCondition(condition);
        PageInfo pageInfo = new PageInfo(list,navigatePages);
        return pageInfo;
    }
}
