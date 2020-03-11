package com.albb.Daili;

import com.albb.ITface.Dog;

/**
 * @author: shb
 * @create: 2020-03-10 16:08
 **/
public class DogJingtai implements Dog {
    private Dog dog;

    public DogJingtai(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void eat() {
        System.out.println("吃肉前");
        dog.eat();
        System.out.println("吃肉后");
    }
}
