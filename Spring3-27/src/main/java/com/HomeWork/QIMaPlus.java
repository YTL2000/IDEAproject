package com.HomeWork;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className QIMaPlus
 * since 1.0
 */
@Aspect
@Component
public class QIMaPlus {
    @Pointcut(value = "execution(* com.HomeWork.QiMaImpl())")
    public void pt(){};
    @Before(value = "pt()")
    public void before(){
        System.out.println("侦察兵侦察");
    }
    @After(value = "pt()")
    public void After(){
        System.out.println("返回打扫战场");
    }


}
