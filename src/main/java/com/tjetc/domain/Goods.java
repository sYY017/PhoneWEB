package com.tjetc.domain;
//商品实体类
public class Goods {
    private int goodsId;//商品编号
    private String typeId;//商品类型编号
    private String detailsId;//商品详情编号

    public Goods() {
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", typeId='" + typeId + '\'' +
                ", detailsId='" + detailsId + '\'' +
                '}';
    }
}
