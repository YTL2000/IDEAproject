package com.ytl.dao;

import com.ytl.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className ProductDaoImpl
 * since 1.0
 */
@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Product> findAllProduct() {
        String sql="select * from product";
        //调用query方法传入sql语句  和 映射实体类class文件
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Product.class));
    }

    @Override
    public Product findProduct(Integer id) {
        String sql="select * from product where pid=?";
        //调用query方法传入sql语句  和 映射实体类class文件
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Product.class),id);
    }

    @Override
    public int addProduct(Product product) {
        String sql="insert product values(null,?,?,?,?)";
        //调用query方法传入sql语句  和 映射实体类class文件
        return jdbcTemplate.update(sql,product.getPNum(),product.getPname(),product.getPrice(),product.getCityName());

    }

    @Override
    public int delProduct(Integer id) {
        String sql="delete from product where pid=?";
        //调用query方法传入sql语句  和 映射实体类class文件
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updProduct(Product product) {
        String sql="update product set pNum=?,pName=?,price=?,cityName=? where pid=?";
        //调用query方法传入sql语句  和 映射实体类class文件
        return jdbcTemplate.update(sql,product.getPNum(),product.getPname(),product.getPrice(),product.getCityName(),product.getPid());
    }
}
