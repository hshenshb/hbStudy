package com.albb.demo20200311;

/**
 * @author: shb
 * @create: 2020-03-11 09:48
 **/
public class Test {
    public static void main(String[] args) {
        People p =new PeopleImpl();
        p.eat();
        System.out.println(p.getClass());
        Dongtaidaili dot=new Dongtaidaili();
        p = (People) dot.getObj(p);

        p.eat();
        System.out.println(p.getClass());
    }
}
