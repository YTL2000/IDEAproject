package com.ytl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className Product
 * since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("p1")
public class Product {
    @Value("123")
    private int id;
    @Value("2023-3-23")
    private String Pnum;
    @Value("汽水")
    private String Pname;
}
