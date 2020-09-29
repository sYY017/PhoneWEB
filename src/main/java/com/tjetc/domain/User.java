package com.tjetc.domain;

//用户实体类
public class User {
    private int userId;//用户编号
    private String userName;//用户名
    private String password;//密码
    private int role;//角色 1.超级管理员2.管理员3.用户
    private String tel;//手机号
    private int vip;//1.普通用户2.白金用户3.黄金用户
    private int score;//用户积分
    private String carId;//购物车编号
    private int status;//1正常 0禁用

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", tel='" + tel + '\'' +
                ", vip=" + vip +
                ", score=" + score +
                ", carId='" + carId + '\'' +
                ", status=" + status +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
