package com.albb.Daili;

import com.albb.ITface.Dog;

/**
 * @author: shb
 * @create: 2020-03-10 16:05
 **/
public class DogImpl implements Dog {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
