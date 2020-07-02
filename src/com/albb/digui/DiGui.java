package com.albb.digui;

/**
 * @author: shb
 * @create: 2020-04-03 10:29
 **/
public class DiGui {
    public static int SF(int num){

        if(num==1){
            return 1;
        }else {
            return num*SF(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(SF(5));
    }
}
