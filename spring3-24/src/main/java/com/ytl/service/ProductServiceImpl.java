package com.ytl.service;

import com.ytl.dao.ProductDao;
import com.ytl.dao.ProductDaoImpl;
import com.ytl.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductServiceImpl
 * since 1.0
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{
    @Autowired
     ProductDao productDao;
    @Override
    public List<Product> findAllProduct() {
        return productDao.findAllProduct();
    }
    @Override
    public Product findProduct(Integer id) {
        return productDao.findProduct(id);
    }
    @Override
    public int addProduct(Product product) {
        return productDao.addProduct(product);
    }
    @Override
    public int delProduct(Integer id) {
        return productDao.delProduct(id);
    }
    @Override
    public int updProduct(Product product) {
        return productDao.updProduct(product);
    }
}
