package com.netctoss.mapper;
import com.netctoss.pojo.SearchCondition;
import com.netctoss.pojo.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServiceMapper {
    List<Service> findByPageAndCondition(SearchCondition condition);
    boolean change(Integer serviceId);
    boolean delete(Integer Id);
    Service findById(Integer Id);
    boolean update(Service service);
    boolean add(Service service);
    Service findByidcardNo(String cardNo);
}
