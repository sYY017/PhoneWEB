package com.tjetc.domain;

import java.util.Date;

//订单表
public class Order {
    private String orderId;//订单编号
    private int userId;//用户编号
    private String orderTel;//手机号
    private Date time;//订单时间
    private String address;//地址
    private String detailsId;//商品编号
    private double price;//金额
    private int status;//订单状态 1.已下单并付款 2.已下单未付款 3.取消订单

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId=" + userId +
                ", orderTel='" + orderTel + '\'' +
                ", time=" + time +
                ", address='" + address + '\'' +
                ", detailsId='" + detailsId + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
