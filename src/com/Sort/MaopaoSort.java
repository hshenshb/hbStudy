package com.Sort;

import java.util.Arrays;

/**
 * @author: shb
 * @create: 2020-03-30 09:08
 **/
public class MaopaoSort {
      /**
        *
        * @Author: shb
        * @Date: 2020/3/30
       * 对数组进行排序
        */
      public static void sort(Comparable[] arr){
        for(int i=1;i<arr.length;i++){
            for (int j=0;j<arr.length-i;j++){
                if(greater(arr[j],arr[j+1])){
                    exch(arr,j,j+1);
                }
            }
        }
      }
        /**
          *
          * @Author: shb
          * @Date: 2020/3/30
         * 判断两个元素w是否大于元素v
          */
        public static boolean greater(Comparable w,Comparable v){
            return w.compareTo(v)>0;
        }
        public static void exch(Comparable[] arr,int a,int b){
           Comparable num;
           num=arr[a];
           arr[a]=arr[b];
           arr[b]=num;

        }

          /**
            *
            * @Author: shb
            * @Date: 2020/3/30
           * 主方法
            */
          public static void main(String[] args) {
                Integer arr[]={2,3,5,7,1,4,6,9,7,12,0};
                MaopaoSort.sort(arr);
              for (Integer number:arr
                   ) {
                  System.out.print(number+",");
              }
          }
}
