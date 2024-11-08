package com.netctoss.pojo;

import java.util.List;
import java.util.Objects;

public class Admin {
    private int adminId;
    private String adminCode;
    private String password;
    private String name;
    private String telephone;
    private String email;
    private String enrolldate;
    private String roleinfoName;

    private List<Admin> adminList;

    public void setAdminList(List<Admin> list) {
        this.adminList = list;
    }
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnrolldate() {
        return enrolldate;
    }

    public void setEnrolldate(String enrolldate) {
        this.enrolldate = enrolldate;
    }

    public String getRoleinfoName() {
        return roleinfoName;
    }

    public void setRoleinfoName(String roleinfoName) {
        this.roleinfoName = roleinfoName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return adminId == admin.adminId && Objects.equals(adminCode, admin.adminCode) && Objects.equals(password, admin.password) && Objects.equals(name, admin.name) && Objects.equals(telephone, admin.telephone) && Objects.equals(email, admin.email) && Objects.equals(enrolldate, admin.enrolldate) && Objects.equals(roleinfoName, admin.roleinfoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminCode, password, name, telephone, email, enrolldate, roleinfoName);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", enrolldate='" + enrolldate + '\'' +
                ", roleinfoName='" + roleinfoName + '\'' +
                '}';
    }

    public Admin(int adminId, String adminCode, String password, String name, String telephone, String email, String enrolldate, String roleinfoName) {
        this.adminId = adminId;
        this.adminCode = adminCode;
        this.password = password;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.enrolldate = enrolldate;
        this.roleinfoName = roleinfoName;
    }

    public Admin() {
    }
}
