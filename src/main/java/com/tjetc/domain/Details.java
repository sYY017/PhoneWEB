package com.tjetc.domain;
//商品详情描述
public class Details {
    private String detailsId;//商品详情编号
    private String goodsName;//商品名称
    private double price;//手机价格
    private String color;//手机颜色
    private String memory;//存储大小
    private String describe;//详情描述
    private int num;//库存数量
    private String img;//图片
    private int status;//1.已上架0.已下架

    public Details() {
    }

    @Override
    public String toString() {
        return "Details{" +
                "detailsId='" + detailsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", memory='" + memory + '\'' +
                ", describe='" + describe + '\'' +
                ", num=" + num +
                ", img='" + img + '\'' +
                ", status=" + status +
                '}';
    }

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
