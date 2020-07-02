package com.Sort;

import java.util.*;

/**
 * @author: shb
 * @create: 2020-03-31 10:58
 **/
public class insertionSort {
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
        * @Date: 2020/4/1
       * 插入排序，左侧为有序，随后的数据依次和左侧比较后交换
        */
    public static void Sort(Comparable [] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                    if(greater(arr[j-1],arr[j])){
                        exch(arr,j,j-1);

                    }else {
                        break;
                    }
            }
        }
    }

    public static void main(String[] args) {
        /*Integer arr[]={2,3,5,7,1,4,6,9,7,12,0};
        insertionSort.Sort(arr);
        System.out.println(Arrays.toString(arr));*/
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("12");
        list.add("1235749");
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            iterator.add("565656");//虽然添加但是迭代器已经后移位置，所以不会管新加的内容
            //也就是说===》listiterator.add()方法会把新元素添加到listiterator当前所指位置的左边,
            // listiterator.next()不鸟这个新来的不鸟他（不管正向还是反向都不管  previous()可以联系它，安慰它的小心心 ）
            System.out.println(next);
        }


    }
}
