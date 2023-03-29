package com.ytl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Component
public class Product {
    private Integer pid;//主键
    private String pNum;//商品编号
    private String pname;//商品名称
    private double price;//商品价格
    private String cityName;//商品产地
}
