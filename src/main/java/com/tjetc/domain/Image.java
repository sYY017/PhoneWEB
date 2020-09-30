package com.tjetc.domain;
//图片表
public class Image {
    private String imgId;//图片编号
    private String path;//图片路径

    public Image() {
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imgId='" + imgId + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
