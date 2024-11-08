package com.netctoss.pojo;

import java.util.Arrays;
import java.util.List;

public class Role {
    private int roleId;
    private String roleName;
    private String privilegeName;
    private Integer[] privilegeID;
    private List<Privilege> privilegeIds;

    public Role() {
    }

    public Role(int roleId, String roleName, String privilegeName, Integer[] privilegeID, List<Privilege> privilegeIds) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.privilegeName = privilegeName;
        this.privilegeID = privilegeID;
        this.privilegeIds = privilegeIds;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", privilegeName='" + privilegeName + '\'' +
                ", privilegeID=" + Arrays.toString(privilegeID) +
                ", privilegeIds=" + privilegeIds +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public Integer[] getPrivilegeID() {
        return privilegeID;
    }

    public void setPrivilegeID(Integer[] privilegeID) {
        this.privilegeID = privilegeID;
    }

    public List<Privilege> getPrivilegeIds() {
        return privilegeIds;
    }

    public void setPrivilegeIds(List<Privilege> privilegeIds) {
        this.privilegeIds = privilegeIds;
    }
}
