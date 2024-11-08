package com.netctoss.mapper;


import com.netctoss.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AccountMapper {
    List<Account> findAll();
    List<Account> findBaobiao();
    List<Account> findByTime();
    Account findByAccountId(int id);
    boolean update(Account account);
    boolean addAccount(Account account);
    boolean change(Integer Id);
    boolean delete(Integer Id);
}
