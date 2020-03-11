package com.albb.Daili1;

import java.lang.reflect.Proxy;

/**
 * @author: shb
 * @create: 2020-03-10 16:37
 **/
public class Porxy {
    public static Object getPorxy(Object tar){
        MyInvocationHandle myInvocationHandle=new MyInvocationHandle(tar);
        Object object= Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                tar.getClass().getInterfaces(),myInvocationHandle);
         return object;
    }
}
