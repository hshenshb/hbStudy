package com.Test;
import com.albb.pojo.A;
import com.albb.pojo.B;

import java.text.DecimalFormat;


/**
 * @author: shb
 * @create: 2020-06-26 12:02
 **/
public class Demo20200627 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l%10);
        double random = Math.random();
        DecimalFormat df =new DecimalFormat("##0.00");
        System.out.println(df.format(random*10));
    }
}
