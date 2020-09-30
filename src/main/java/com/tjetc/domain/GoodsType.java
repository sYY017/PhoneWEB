package com.tjetc.domain;
//商品类型表
public class GoodsType {
    private String typeId;//商品类型编号
    private String typeName;//商品类型名称

    public GoodsType() {
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
