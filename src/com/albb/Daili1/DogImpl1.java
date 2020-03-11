package com.albb.Daili1;

import com.albb.ITface.Dog;

/**
 * @author: shb
 * @create: 2020-03-10 16:05
 **/
public class DogImpl1 implements Dog {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
