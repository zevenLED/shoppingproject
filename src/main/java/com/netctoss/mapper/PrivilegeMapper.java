package com.netctoss.mapper;
import com.netctoss.pojo.Privilege;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrivilegeMapper {
    List<Privilege> findBySecondStep(Integer roleId);
}
