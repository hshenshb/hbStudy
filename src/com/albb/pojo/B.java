package com.albb.pojo;

/**
 * @author: shb
 * @create: 2020-06-26 12:13
 **/
public class B extends A{
    static {
        System.out.println("2");
    }
    public void Btest(){
        System.out.println("5");
    }

    public B() {
        System.out.println("6");
    }
}
