package com.tjetc.domain;
//购物车表
public class Car {
    private String carId;//购物车编号
    private GoodsDetails details;//商品详情编号
    private int carCount;//购物车加购数量
    private User user;//用户编号

    public Car() {
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public GoodsDetails getDetails() {
        return details;
    }

    public void setDetails(GoodsDetails details) {
        this.details = details;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", details=" + details +
                ", carCount=" + carCount +
                ", user=" + user +
                '}';
    }
}
