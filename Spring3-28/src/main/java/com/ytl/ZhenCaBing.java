package com.ytl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther YTL
 * @className ZhenCaBing
 * since 1.0
 */
@Aspect
@Component
public class ZhenCaBing {
    @Pointcut(value = "execution(* com.ytl.GuanYuDaoImpl.horse())")
   public void pt(){};
    @Before(value = "pt()")
    public void before(){
        System.out.println("关羽骑马");
   }
    @Around(value = "pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("曹操侦察兵");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("退兵");
        return proceed;
    }
    @After(value = "pt()")
    public void after(){
        System.out.println("打扫战场");
    }
}
