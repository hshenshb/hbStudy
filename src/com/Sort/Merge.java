package com.Sort;

/**
 * @author: shb
 * @create: 2020-04-09 10:08
 **/
public class Merge {
    public static Comparable[] assice;
    //对数组内元素进行排序
    public static void Sort(Comparable[] arr){
        //初始化辅助数组
        assice=new Comparable[arr.length];
        int lo=0;
        int hi=arr.length-1;
        //调用重载方法进行规定索引处的排序
        Sort(arr,lo,hi);
    }
    //对数组中的lo到hi的元素进行排序
    public static void Sort(Comparable[] arr,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int mid=(lo+hi)/2;
        Sort(arr,lo,mid);
        Sort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }
    //对两个子组进行归并
    public static void merge(Comparable[] arr,int lo,int mid,int hi){
        //定义辅助数组指针、两个子组的指针
        int i=lo;
        int a1=lo;
        int a2=mid+1;
        //两个子组都没有到达界限
        while (a1<=mid && a2<=hi){
            if(less(arr[a1],arr[a2])){
                assice[i++]=arr[a2++];
            }
            else { assice[i++]=arr[a1++];}
        }
        //如果第一个子组没有到达界限
        while (a1<=mid){
            assice[i++]=arr[a1++];
        }
        //如果第二个子组没有到达界限
        while (a2<=hi){
            assice[i++]=arr[a2++];
        }
        //将辅助数组赋值给原数组
        for (int num=lo;num<=hi;num++){
            arr[num]=assice[num];
        }


    }
    //判断w是否大于v
    public static boolean less(Comparable w,Comparable v){
        return w.compareTo(v)>0;
    }
    public static void main(String[] args) {
        Integer arr[]={2,3,5,7,1,4,6,9,7,12,0};
        Merge.Sort(arr);
        for (Integer number:arr
        ) {
            System.out.print(number+",");
        }
    }
}
