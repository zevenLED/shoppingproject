package com.netctoss.service;

import com.github.pagehelper.PageInfo;
import com.netctoss.pojo.Role;


public interface RoleService {
    PageInfo findAll(Integer pageNum);
    boolean addprivilege(String name);
    boolean addprivilege2(Integer privilegeID);
    Role findRoleAndPri(Integer roleId);
    Boolean UpdateRole(String name,int role);
    Boolean UpdateRole2(Integer roleId,int role);
}
