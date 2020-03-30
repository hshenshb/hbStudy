package com.Sort;

/**
 * @author: shb
 * @create: 2020-03-30 09:59
 **/
public class XuanzeSort {

      /**
        *
        * @Author: shb
        * @Date: 2020/3/30
        *判断w是否大于v
       */
       public static boolean greater(Comparable  w,Comparable v){
           return w.compareTo(v)>0;
       }

          /**
            *
            * @Author: shb
            * @Date: 2020/3/30
           * 数组排序
            */
          public static void sort(Comparable[] arr){
            Comparable num;
              for(int a=0;a<arr.length;a++){
                  for (int b=a+1;b<arr.length;b++)
                  if(greater(arr[a],arr[b])){
                      num=arr[b];
                      arr[b]=arr[a];
                      arr[a]=num;


                  }
              }
          }

    public static void main(String[] args) {
        Integer arr[]={2,3,5,7,1,4,6,9,7,12,0};
        XuanzeSort.sort(arr);
        for (Integer number:arr
        ) {
            System.out.print(number+",");
        }
    }
}
