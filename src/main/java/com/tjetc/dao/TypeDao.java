package com.tjetc.dao;

import com.tjetc.domain.Type;

import java.util.List;

public interface TypeDao {
    //添加商品类型
    int addType(Type type);

    //查询全部类型名称
    List<Type> getAllTypeName();
}
