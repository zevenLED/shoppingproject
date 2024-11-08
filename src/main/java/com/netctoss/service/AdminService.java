package com.netctoss.service;

import com.github.pagehelper.PageInfo;
import com.netctoss.pojo.Admin;
import com.netctoss.pojo.SearchCondition;


public interface AdminService {
    Admin Checklogin(Admin admin);
    Admin Checklogin2(Admin admin);
    boolean updateAdmin(Admin admin);
    boolean updatePassword(Admin admin);
    PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum);
}
