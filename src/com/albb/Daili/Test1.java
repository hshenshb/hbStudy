package com.albb.Daili;

import com.albb.ITface.Dog;

/**
 * @author: shb
 * @create: 2020-03-10 16:12
 **/
public class Test1 {
    public static void main(String[] args) {
        Dog dog=new DogImpl();
        DogJingtai dogjt=new DogJingtai(dog);
        dogjt.eat();
    }

}
