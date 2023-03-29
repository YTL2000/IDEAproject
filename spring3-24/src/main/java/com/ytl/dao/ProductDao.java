package com.ytl.dao;

import com.ytl.entity.Product;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductDao
 * since 1.0
 */
public interface ProductDao {
    //查看所有商品
    public List<Product> findAllProduct();
    //根据id查看单个商品
    public Product findProduct(Integer id);
    //增加商品
    public int addProduct(Product product);
    //根据id删除商品
    public int delProduct(Integer id);
    //修改商品
    public int updProduct(Product product);

}
