package com.ytl.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @version 1.0
 * @auther YTL
 * @className Coll
 * since 1.0
 */
@Data
@Component("Coll")
public class Coll {
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;
    private Properties properties;
}
