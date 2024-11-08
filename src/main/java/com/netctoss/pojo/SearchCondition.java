package com.netctoss.pojo;

public class SearchCondition {
    private String osUsername;
    private String unixHost;
    private String idcardNo;
    private Integer status;

    @Override
    public String toString() {
        return "SearchCondition{" +
                "osUsername='" + osUsername + '\'' +
                ", unixHost='" + unixHost + '\'' +
                ", idcardNo='" + idcardNo + '\'' +
                ", status=" + status +
                '}';
    }

    public SearchCondition(String osUsername, String unixHost, String idcardNo, Integer status) {
        this.osUsername = osUsername;
        this.unixHost = unixHost;
        this.idcardNo = idcardNo;
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOsUsername() {
        return osUsername;
    }

    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername;
    }

    public String getUnixHost() {
        return unixHost;
    }

    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public SearchCondition() {
    }
}
