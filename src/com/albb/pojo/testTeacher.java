package com.albb.pojo;

import java.util.Comparator;

/**
 * @author: shb
 * @create: 2020-03-26 11:20
 **/
public class testTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("zs", 10);
        Teacher t2 = new Teacher("ls", 20);
        Teacher teacher=(Teacher) getMax(t1,t2);
        System.out.println(teacher);
    }
    private static Comparable<Teacher> getMax(Teacher t1,Teacher t2){
        if(t1.compareTo(t2)>=0){
            return  t1;
        }else {
            return t2;
        }

    }
}
