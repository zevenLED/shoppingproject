package com.netctoss.pojo;


import lombok.Data;

import java.sql.Timestamp;
/*@Data 是 Lombok 库中的一个注解，用于自动生成 Java 类的常用方法，
如 getter、setter、toString、equals、hashCode 和构造函数。
使用 @Data 注解可以大大减少样板代码，提高开发效率。*/
@Data
public class Cost {
    private Integer id;
    private String name;
    private Integer baseduration;
    private Double basecost;
    private Double unitcost;
    private String status;
    private String descr;
    private Timestamp creatime;
    private Timestamp startime;
    private String costType;

    public Cost() {
    }

    public Cost(Integer id, String name, Integer baseduration, Double basecost, Double unitcost, String status, String descr, Timestamp creatime, Timestamp startime, String costType) {
        this.id = id;
        this.name = name;
        this.baseduration = baseduration;
        this.basecost = basecost;
        this.unitcost = unitcost;
        this.status = status;
        this.descr = descr;
        this.creatime = creatime;
        this.startime = startime;
        this.costType = costType;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseduration=" + baseduration +
                ", basecost=" + basecost +
                ", unitcost=" + unitcost +
                ", status='" + status + '\'' +
                ", descr='" + descr + '\'' +
                ", creatime=" + creatime +
                ", startime=" + startime +
                ", costType='" + costType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

    public Timestamp getStartime() {
        return startime;
    }

    public void setStartime(Timestamp startime) {
        this.startime = startime;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }
}
