package com.ytl.service.impl;

import com.ytl.dao.CustomerDao;
import com.ytl.entity.Customer;
import com.ytl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className CustomerServiceImpl
 * since 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }
    @Override
    public int addCustomer(Customer customer) {
        return customerDao.addCustomer(customer);
    }

    @Override
    public Customer findByIdCustomer(int id) {
        return customerDao.findByIdCustomer(id);
    }

    @Override
    public int updCustomer(Customer customer) {
        return customerDao.updCustomer(customer);
    }

    @Override
    public int delCustomer(String info) {
        return customerDao.delCustomer(info);
    }

    @Override
    public int countCustomer() {
        return customerDao.countCustomer();
    }
}
