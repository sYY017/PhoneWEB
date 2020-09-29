package com.tjetc.dao;

import com.tjetc.domain.Details;

public interface DetailsDao {
    //添加商品
    int addGoodsDetails(Details details);
    //根据ID删除商品
    int delGoodsById(String detailsId);
    //根据ID修改商品数量
}
