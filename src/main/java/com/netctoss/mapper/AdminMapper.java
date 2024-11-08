package com.netctoss.mapper;

import com.netctoss.pojo.Admin;
import com.netctoss.pojo.SearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdminMapper {
    Admin Checklogin(Admin admin);
    Admin Checklogin2(Admin admin);
    boolean updateAdmin(Admin admin);
    boolean updatepassword(Admin admin);
    List<Admin> findByPageAndCondition(SearchCondition condition);
}
