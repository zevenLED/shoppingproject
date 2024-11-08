package com.netctoss.mapper;
import com.netctoss.pojo.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import java.util.List;
@Mapper
public interface RoleMapper {
    List<Role> findAll();
    @Insert("INSERT into  role_info\n" +
            "        (rname)values(#{role})")
    Boolean addPrivilege(@Param("role") String roleName);
    @Insert("INSERT INTO " +
            "role_privilege(role_id,privilege_id)" +
            "VALUES((SELECT role_id FROM role_info ORDER BY role_id DESC LIMIT 1),#{privilegeID});")
    Boolean addPrivilege2(@Param("privilegeID") Integer privilegeID);

    Role findRoleAndPri(Integer roleId);
    @Insert("UPDATE role_info SET rname =#{name} WHERE role_id=#{role};")
    Boolean Update(@Param("name")String name,@Param("role")int role);
    @Update("UPDATE role_privilege\n" +
            "        SET privilege_id = #{privilegeID}\n" +
            "        WHERE role_id = #{role}\n" +
            "        LIMIT 1;")
    Boolean Update2(@Param("privilegeID")Integer privilegeID,@Param("role")int role);
}
