package com.tjetc.domain;
//管理员表
public class Manager {
    private String managerId;//管理员编号
    private String account;//管理员账户
    private String password;//密码
    private String tel;//手机号
    private int role;//1.普通管理员 0.超级管理员

    public Manager() {
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", role=" + role +
                '}';
    }
}
