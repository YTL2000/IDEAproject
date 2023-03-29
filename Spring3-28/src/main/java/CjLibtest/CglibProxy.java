package CjLibtest;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version 1.0
 * @auther YTL
 * @className CglibProxy
 * since 1.0
 */
public class CglibProxy implements MethodInterceptor {
    Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

public HorseImpl createProxy(){//生成CGLIB代理
    Enhancer enhancer = new Enhancer();//创建核心类
    enhancer.setSuperclass(target.getClass());//为其设置父类
    enhancer.setCallback(this);//设置回调
    return (HorseImpl) enhancer.create();//创建代理
}
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("增强开始.....");
        Object invoke = method.invoke(target, objects);
        return invoke;
    }
}
