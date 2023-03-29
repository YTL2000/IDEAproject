package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @auther YTL
 * @className TimerInvocationHandler
 * since 1.0
 */
public class TimerInvocationHandler implements InvocationHandler {
    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke...start");
        Object invoke = method.invoke(target, args);
        System.out.println("invoke...end");
        return invoke;
    }
}
