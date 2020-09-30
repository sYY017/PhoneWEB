package com.tjetc.domain;

//用户地址表
public class Address {
    private String addressId;//地址编号
    private User user;//用户编号
    private String address;//地址信息

    public Address() {
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", user=" + user +
                ", address='" + address + '\'' +
                '}';
    }
}
