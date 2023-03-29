package com.ytl;

import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className GuanYuDaoImpl
 * since 1.0
 */
@Component
public class GuanYuDaoImpl implements GuanYuDao{
    @Override
    public void horse() {
        System.out.println("关羽快来了");
    }
}
