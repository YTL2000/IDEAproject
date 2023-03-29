package dynamic;

import StaticAgent.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version 1.0
 * @auther YTL
 * @className test
 * since 1.0
 */
public class test {
    public static void main(String[] args) {
        MfzDao target = new MfzDaoImpl();
        MfzDao mfzDao = (MfzDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));

        mfzDao.fz();
    }
}
