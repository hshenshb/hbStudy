package com.albb.pojo;

import java.util.Comparator;

/**
 * @author: shb
 * @create: 2020-03-26 11:13
 **/
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:"+this.name+"age:"+this.age;
    }


    @Override
    public int compareTo(Teacher o) {
        return this.getAge()-o.getAge();
    }
}
