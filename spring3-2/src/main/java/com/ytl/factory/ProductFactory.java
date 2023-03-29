package com.ytl.factory;

import com.ytl.entity.Product;

/**
 * @version 1.0
 * @auther YTL
 * @className ProdectFactory
 * since 1.0
 */
public class ProductFactory {
    public Product factory01(){
        return new Product();
    }
    public static Product factory02(){
        return new Product();
    }
}
