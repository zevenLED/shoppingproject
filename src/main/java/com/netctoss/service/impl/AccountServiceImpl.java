package com.netctoss.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netctoss.mapper.AccountMapper;
import com.netctoss.pojo.Account;
import com.netctoss.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;
    private int pageSize = 4;
    private int navigatePages=3;
    @Override
    public PageInfo findByPage(int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accounts=accountMapper.findAll();
        PageInfo pageInfo=new PageInfo(accounts,navigatePages);
        return pageInfo;
    }

    @Override
    public PageInfo findByPagebaobiao(int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accounts=accountMapper.findBaobiao();
        PageInfo pageInfo=new PageInfo(accounts,navigatePages);
        return pageInfo;
    }

    @Override
    public Account findByAccountId(int id) {
        return accountMapper.findByAccountId(id);
    }

    @Override
    public boolean update(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public boolean addAccount(Account account) {
        return accountMapper.addAccount(account);
    }

    @Override
    public boolean change(Integer Id) {
        return accountMapper.change(Id);
    }

    @Override
    public boolean delete(Integer Id) {
        return accountMapper.delete(Id);
    }
}
