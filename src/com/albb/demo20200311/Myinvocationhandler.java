package com.albb.demo20200311;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: shb
 * @create: 2020-03-11 09:37
 **/
public class Myinvocationhandler implements InvocationHandler {
    private Object object;

    public Myinvocationhandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备吃饭了");
        Object obj = method.invoke(object, args);
        System.out.println("吃完休息了");

        return null;
    }
}
