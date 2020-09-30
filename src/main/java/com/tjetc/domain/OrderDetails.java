package com.tjetc.domain;
//订单详情表
public class OrderDetails {
    private String orderDetailsId;//订单详情编号
    private User user;//用户ID
    private GoodsDetails details;//商品详情
    private int buyCount;//购买数量
    private Orders orders;//订单编号

    public OrderDetails() {
    }

    public String getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(String orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GoodsDetails getDetails() {
        return details;
    }

    public void setDetails(GoodsDetails details) {
        this.details = details;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderDetailsId='" + orderDetailsId + '\'' +
                ", user=" + user +
                ", details=" + details +
                ", buyCount=" + buyCount +
                ", orders=" + orders +
                '}';
    }
}
