package com.ytl;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className UserDaoImpl
 * since 1.0
 */
@Component
public class UserDaoImpl implements UserDao{
    @Override
    public void startUser() {
        System.out.println("实现类开始！");
    }
}
