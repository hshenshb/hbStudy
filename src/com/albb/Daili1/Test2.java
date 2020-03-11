package com.albb.Daili1;

import com.albb.ITface.Dog;

/**
 * @author: shb
 * @create: 2020-03-10 16:43
 **/
public class Test2 {
    public static void main(String[] args) {
        Dog dog=new DogImpl1();
        Dog dogTrue=(Dog) Porxy.getPorxy(dog);
        dogTrue.eat();
    }
}
