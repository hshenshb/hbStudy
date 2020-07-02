package com.Sort;

import com.Test.Main;

/**
 * @author: shb
 * @create: 2020-04-02 11:50
 **/
public class ShellSort {
    public static Comparable[] Sort(Comparable[] arr){
        int h=1;
        while (h<arr.length/2){
            h=h*2+1;
        }
        while (h>=1){
            //排序
                for(int i=h;i<arr.length;i++){
                    for (int j=i;j>=h;j-=h){
                        if(exch(arr[j-h],arr[j])){
                            grance(arr,j,j-h);
                        }else {
                            break;
                        }
                    }
                }

            //h进行缩小
            h=h/2;
        }
        return arr;
    }




      /**
        *
        * @Author: shb
        * @Date: 2020/4/2
       * 判断w和v数值的大小
        */
      public static boolean exch(Comparable w,Comparable v){
          return w.compareTo(v)>0;
      }
      /**
        *
        * @Author: shb
        * @Date: 2020/4/2
       * 交换元素
        */
      public static void grance(Comparable[] arr,int w,int v){
          Comparable num;
          num=arr[w];
          arr[w]=arr[v];
          arr[v]=num;
      }

    public static void main(String[] args) {
        Integer arr[]={2,3,5,7,1,4,6,9,7,12,0};
        ShellSort.Sort(arr);
        for (Integer number:arr
        ) {
            System.out.print(number+",");
        }
    }

}
