package com.netctoss.service;

import com.github.pagehelper.PageInfo;
import com.netctoss.pojo.SearchCondition;
import com.netctoss.pojo.Service;

public interface ServiceService {
    PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum);
    boolean change(Integer serviceId);
    boolean delete(Integer costId);
    Service findById(Integer serviceId);
    boolean update(Service service);
    boolean add(Service service);
    Service findByidcardNo(String idcardNo);

}
