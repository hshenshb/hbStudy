package com.Test;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    static boolean a;
    public static void main(String[] args) {
//        String[] st=new String[]{"surprise","happy","ctrip", "travel", "wellcome","student","system","program","editor"};
//        ArrayList<char[]> list = new ArrayList<>();
//        for (String s:st) {
//            list.add( s.toCharArray());
//
//        }
        //
       // 某小红薯在小红书的活动中抽奖中了一定价值的薯券，这些薯券可以用来购买一批商品，求有多少种购买组合。其中一件商品可以买多件。
      //  输 入:薯券金额、商品分别价格
      //  输出 :组合数

//        Scanner scanner =new  Scanner(System.in);
//        int totalPrice = scanner.nextInt();
//        String next = scanner.next();
//        int length = next.length();
//        String substring = next.substring(1, length-1);
//        String[] split = substring.split(",");
//        int[] arr =new  int[split.length];
//        for (int i = 0; i < split.length; i++) {
//            arr[i] =Integer.parseInt(split[i]);
//        }
//        int[] dp =new int[totalPrice+1];
//        dp[0]=1;
//        for (int i : arr) {
//            for (int j = i; j <= totalPrice; j++) {
//                dp[j]+=dp[j-i];
//            }
//        }
//        System.out.println(dp[totalPrice]);
//
//    }

      //  System.out.println(a);
//99乘法表//        mtd(9);
            BigDecimal a=new BigDecimal("0.1");
            BigDecimal b=new BigDecimal("0.1");
            a=a.add(b);
        System.out.println(a);


    }
//    public  static void mtd(int num){
//        if(num==1){
//            System.out.println("1*1=1");
//        }
//	else{
//            mtd(num-1);
//            for(int i=1;i<=num;i++){
//                System.out.print(i+"*"+num+"="+ i*num +"\t");
//
//            }
//            System.out.println("");
//        }
//    }

}
