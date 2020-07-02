package com.Test;

import com.albb.pojo.Teacher;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author: shb
 * @create: 2020-06-24 08:21
 **/
public class Demo {
    public static void main(String[] args) {
        //输入int返回int要求数字反向并且数字不重复
      /*  Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        char [] arr=Integer.toString(num).toCharArray();
        StringBuffer stringBuffer=new StringBuffer("");
        for(int i=arr.length-1;i>=0;i--){
            if(stringBuffer.toString().indexOf(arr[i])>=0){
                continue;
            }else {
                stringBuffer.append(arr[i]);
            }
        }
        int out = Integer.parseInt(stringBuffer.toString());
        System.out.println(out);
    */
        printMethor(new Teacher("zs",10));
    }
    public static void printMethor(Object obj ){
        Class<?> aClass = obj.getClass();
        try {
            Method declaredMethod = aClass.getDeclaredMethod("outTeacher");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
