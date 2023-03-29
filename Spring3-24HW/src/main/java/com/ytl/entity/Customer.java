package com.ytl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className USER
 * since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Customer {
    private Integer id;
    private String name;
    private String pwd;

}
