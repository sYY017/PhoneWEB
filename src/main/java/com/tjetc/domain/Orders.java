package com.tjetc.domain;

import java.util.Date;

//订单表
public class Orders {
    private String orderId;//订单编号
    private Date time;//下单时间
    private String tel;//联系方式
    private Address address;//订单地址
    private double sumMoney;//订单总金额
    private int status;//订单状态 1.已下单并付款 2.已下单未付款 3.取消订单

    public Orders() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
