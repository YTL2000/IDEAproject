package com.ytl.dao;

import com.ytl.entity.Product;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductDaoImpl
 * since 1.0
 */
public class ProductDaoImpl implements ProductDao{
    @Override
    public int saveProduct(Product p) {
        System.out.println("保存成功！");
        return 0;
    }
}
