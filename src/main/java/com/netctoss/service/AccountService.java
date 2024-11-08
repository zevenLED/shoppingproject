package com.netctoss.service;

import com.github.pagehelper.PageInfo;
import com.netctoss.pojo.Account;


public interface AccountService {
    PageInfo findByPage(int pageNum);
    PageInfo findByPagebaobiao(int pageNum);
    Account findByAccountId(int id);
    boolean update(Account account);
    boolean addAccount(Account account);
    boolean change(Integer Id);
    boolean delete(Integer Id);
}
