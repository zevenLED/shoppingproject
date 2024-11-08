package com.netctoss.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.netctoss.mapper.RoleMapper;
import com.netctoss.pojo.Role;
import com.netctoss.service.RoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    private int pageSize = 5;
    private int navigatePages=3;
    @Override
    public PageInfo findAll(Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> list=roleMapper.findAll();
        PageInfo pageInfo=new PageInfo(list,navigatePages);
        return pageInfo;
    }

    @Override
    public boolean addprivilege(String name) {
        return roleMapper.addPrivilege(name);
    }

    @Override
    public boolean addprivilege2(Integer privilegeID) {
        return roleMapper.addPrivilege2(privilegeID);
    }

    @Override
    public Role findRoleAndPri(Integer roleId) {
        return roleMapper.findRoleAndPri(roleId);
    }

    @Override
    public Boolean UpdateRole(String name,int role) {
        return roleMapper.Update(name,role);
    }

    @Override
    public Boolean UpdateRole2(Integer roleId,int role) {
        return roleMapper.Update2(roleId,role);
    }


}
