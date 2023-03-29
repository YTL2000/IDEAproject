package com.HomeWork;

import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className QiMaImpl
 * since 1.0
 */
@Component
public class QiMaImpl implements QiMa{
    @Override
    public  void qima() {
        System.out.println("关羽骑马来了");
    }
}
