package com.ytl.dao.impl;

import com.ytl.dao.CustomerDao;
import com.ytl.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className CustomerDaoImpl
 * since 1.0
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //查询所有
    @Override
    public List<Customer> findAllCustomer() {
        String sql="select * from t_user";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Customer.class));
    }
    //添加整个
    @Override
    public int addCustomer(Customer customer) {
        String sql="insert t_user values(null,?,?)";
        return jdbcTemplate.update(sql,customer.getName(),customer.getPwd());
    }
    //根据id删除
    @Override
    public Customer findByIdCustomer(int id) {
        String sql="select * from t_user where id=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Customer.class),id);
    }
    //修改用户
    @Override
    public int updCustomer(Customer customer) {
        String sql="update t_user set name=?,pwd=? where id=?";
        return jdbcTemplate.update(sql,customer.getName(),customer.getPwd(),customer.getId());
    }
    //模糊删除
    @Override
    public int delCustomer(String info) {
        String sql="delete from t_user where name like concat('%',?,'%')";
        return jdbcTemplate.update(sql,info);
    }
    //统计用户总人数
    @Override
    public int countCustomer() {
        String sql=" select count(id) from t_user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}
