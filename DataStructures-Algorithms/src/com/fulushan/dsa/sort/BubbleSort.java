package com.fulushan.dsa.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <冒泡排序>
 * Author fulushan
 * Created on 2017/8/7.
 */
public class BubbleSort {


    public static void main(String[] args) {
        int arr[] = {1,10,60,55,40,33,100,15,78,80};
        int temp;
        System.out.println("排序前:\n"+ Arrays.toString(arr));
         //@注意上边的外部循环的边界是 length-1,因为最后一个元素不用比较了。
        for(int i=0;i<arr.length-1;i++){
            boolean isNotSort = true;
            //@内部循环的边界随着外部循环的变化而变化，也就是在前面比较后的记录就不用参与下一轮的比较。
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isNotSort = false;
                }
            }
            if(isNotSort){
                break;
            }
        }
        System.out.println("排序后:\n"+ Arrays.toString(arr));
    }
}
