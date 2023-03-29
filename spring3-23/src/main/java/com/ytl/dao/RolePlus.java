package com.ytl.dao;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className RolePlus
 * since 1.0
 */
@Aspect
@Component
public class RolePlus {
    @Pointcut(value = "execution(* com.ytl.dao.QLDIWeaponImpl.ZuoQi())")
    public void pt(){};
    @Before(value = "pt()")
    public void before(){
        System.out.println("Twobefore!!");
    }
    @After(value = "pt()")
    public void after(){
        System.out.println("Bafter!!");
    }
}
