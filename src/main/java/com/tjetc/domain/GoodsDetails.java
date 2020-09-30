package com.tjetc.domain;
//商品详情表
public class GoodsDetails {
    private String detailsId;//商品详情编号
    private String goodsName;//商品名称
    private double price;//商品价格
    private String color;//商品颜色
    private String memory;//存储大小
    private String describes;//详情描述
    private int num;//库存数量
    private Image image;//图片
    private int status;//1.已上架0.已下架
    private GoodsType type;//商品类型

    public GoodsDetails() {
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

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public GoodsType getType() {
        return type;
    }

    public void setType(GoodsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "GoodsDetails{" +
                "detailsId='" + detailsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", memory='" + memory + '\'' +
                ", describes='" + describes + '\'' +
                ", num=" + num +
                ", image=" + image +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
