package com.albb.demo20200311;

import java.lang.reflect.Proxy;

/**
 * @author: shb
 * @create: 2020-03-11 09:44
 **/
public class Dongtaidaili {
    public Object getObj(Object o){
        Myinvocationhandler myin =new Myinvocationhandler(o);
        Object o1= Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),myin);

        return o1;
    }
}
