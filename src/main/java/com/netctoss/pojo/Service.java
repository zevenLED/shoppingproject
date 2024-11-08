package com.netctoss.pojo;

import java.sql.Timestamp;

public class Service {
    private Integer serviceId;
    private Integer accountId;
    private String unixHost ;//
    private String osUsername;
    private String loginPasswd;
    private String status;
    private Timestamp createDate;
    private Timestamp pauseDate ;
    private Timestamp closeDate ;//private Timestamp closeDate ;//
    private Integer cost_id;
    private String idcardNo;
    private String name;
    private String realname;
    private Integer baseduration;
    private Double basecost;
    private Double unitcost;
    private String loginname;

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", accountId=" + accountId +
                ", unixHost='" + unixHost + '\'' +
                ", osUsername='" + osUsername + '\'' +
                ", loginPasswd='" + loginPasswd + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", pauseDate=" + pauseDate +
                ", closeDate=" + closeDate +
                ", cost_id=" + cost_id +
                ", idcardNo='" + idcardNo + '\'' +
                ", name='" + name + '\'' +
                ", realname='" + realname + '\'' +
                ", baseduration=" + baseduration +
                ", basecost=" + basecost +
                ", unitcost=" + unitcost +
                ", loginname='" + loginname + '\'' +
                '}';
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public Integer getBaseduration() {
        return baseduration;
    }

    public void setBaseduration(Integer baseduration) {
        this.baseduration = baseduration;
    }

    public Double getBasecost() {
        return basecost;
    }

    public void setBasecost(Double basecost) {
        this.basecost = basecost;
    }

    public Double getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(Double unitcost) {
        this.unitcost = unitcost;
    }

    public Service(Integer serviceId, Integer accountId, String unixHost, String osUsername, String loginPasswd, String status, Timestamp createDate, Timestamp pauseDate, Timestamp closeDate, Integer cost_id, String idcardNo, String name, String realname, Integer baseduration, Double basecost, Double unitcost, String loginname) {
        this.serviceId = serviceId;
        this.accountId = accountId;
        this.unixHost = unixHost;
        this.osUsername = osUsername;
        this.loginPasswd = loginPasswd;
        this.status = status;
        this.createDate = createDate;
        this.pauseDate = pauseDate;
        this.closeDate = closeDate;
        this.cost_id = cost_id;
        this.idcardNo = idcardNo;
        this.name = name;
        this.realname = realname;
        this.baseduration = baseduration;
        this.basecost = basecost;
        this.unitcost = unitcost;
        this.loginname = loginname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUnixHost() {
        return unixHost;
    }

    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost;
    }

    public String getOsUsername() {
        return osUsername;
    }

    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(Timestamp pauseDate) {
        this.pauseDate = pauseDate;
    }

    public Timestamp getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Timestamp closeDate) {
        this.closeDate = closeDate;
    }

    public Integer getCost_id() {
        return cost_id;
    }

    public void setCost_id(Integer cost_id) {
        this.cost_id = cost_id;
    }

    public Service() {
    }

}
