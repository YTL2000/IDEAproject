package com.ytl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 1.0
 * @auther YTL
 * @className Order
 * since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("order")
public class Order {
    @Value("123456")
    private int id;
    @Value("2012-12-12")
    private String num;
    @Autowired
    @Qualifier("p1")
    private List<Product> productList;
}
