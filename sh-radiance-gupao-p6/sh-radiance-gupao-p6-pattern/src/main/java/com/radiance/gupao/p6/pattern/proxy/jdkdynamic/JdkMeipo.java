package com.radiance.gupao.p6.pattern.proxy.jdkdynamic;

import com.radiance.gupao.p6.pattern.proxy.staticproxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author sunhao
 * @date 2020/11/11 17:47
 * @Description:
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }
}
