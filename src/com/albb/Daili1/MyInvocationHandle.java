package com.albb.Daili1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: shb
 * @create: 2020-03-10 16:18
 **/
public class MyInvocationHandle implements InvocationHandler {
    private Object object;

    public MyInvocationHandle(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前");
        object=method.invoke(object,args);
        System.out.println("动态代理后");
        return null;
    }
}
