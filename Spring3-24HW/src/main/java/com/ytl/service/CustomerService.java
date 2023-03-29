package com.ytl.service;

import com.ytl.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className CustomerService
 * since 1.0
 */
@Component
public interface CustomerService {
    //查询你所有
    public List<Customer> findAllCustomer();
    //添加整个
    public int addCustomer(Customer customer);
    //查询单个
    public Customer findByIdCustomer(int id);
    //修改数据
    public int updCustomer(Customer customer);
    //模糊查询和删除
    public int delCustomer(String info);
    //查询总条数
    public int countCustomer();
}
