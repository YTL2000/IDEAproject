package com.ytl.controller;

import com.ytl.entity.Customer;
import com.ytl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className CustomerController
 * since 1.0
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    //查询你所有
    public List<Customer> findAllCustomer(){
        return customerService.findAllCustomer();
    };
    //添加整个
    public int addCustomer(Customer customer){
        return customerService.addCustomer(customer);
    };
    //查询单个
    public Customer findByIdCustomer(int id){
        return customerService.findByIdCustomer(id);
    };
    //修改数据
    public int updCustomer(Customer customer){
        return customerService.updCustomer(customer);
    };
    //模糊查询和删除
    public int delCustomer(String info){
        return customerService.delCustomer(info);
    };
    //查询总条数
    public int countCustomer(){
        return customerService.countCustomer();
    };
}
