package com.ytl.controller;

import com.ytl.entity.Product;
import com.ytl.service.ProductService;
import com.ytl.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductController
 * since 1.0
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    //查看所有商品
    public List<Product> findAllProduct(){
        return productService.findAllProduct();
    }

    //根据id查看单个商品
    public Product findProduct(Integer id){
        return productService.findProduct(id);
    }
    //增加商品
    public int addProduct(Product product){
        return productService.addProduct(product);
    }
    //根据id删除商品
    public int delProduct(Integer id){
        return productService.delProduct(id);
    }
    //修改商品
    public int updProduct(Product product){
        return productService.updProduct(product);
    }
}
