package com.albb.pojo;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author: shb
 * @create: 2020-03-09 10:57
 **/
public class StringBufTest {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//
//        String string=in.nextLine();
//        StringBuffer stringBuffe=new StringBuffer(string);
//        System.out.println(stringBuffe.reverse());
        Vector<Integer> vector=new Vector<Integer> ();
        int a=1;
        int b=2;
        int c=3;
        vector.add(a);
        vector.add(b);
        vector.add(c);
        for (int num:vector) {
            System.out.println(num);
        }
    }
}
