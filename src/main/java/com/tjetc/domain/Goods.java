package com.tjetc.domain;
//商品实体类
public class Goods {
    private String goodsId;//商品编号
    private GoodsType type;//商品类型
    private GoodsDetails details;//商品详情编号

    public Goods() {
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public GoodsType getType() {
        return type;
    }

    public void setType(GoodsType type) {
        this.type = type;
    }

    public GoodsDetails getDetails() {
        return details;
    }

    public void setDetails(GoodsDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", type=" + type +
                ", details=" + details +
                '}';
    }
}
