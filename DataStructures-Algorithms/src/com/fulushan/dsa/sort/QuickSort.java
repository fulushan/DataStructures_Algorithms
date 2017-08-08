package com.fulushan.dsa.sort;

import java.util.Arrays;

/**
 * <快速排序>
 * Author fulushan
 * Created on 2017/8/7.
 * 时间复杂度为O(nlogn)
 */
public class QuickSort {
   static int  array[] = {1,10,60,55,40,33,100,15,78,80,180};
    public static void main(String[] args) {

        System.out.println("排序前:\n"+ Arrays.toString(array));
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(1,array.length-1);
        System.out.println("排序后:\n"+ Arrays.toString(array));
    }

    private  void quickSort(int left,int right){
       if(left>=right){
           return;
       }
        int i,j,temp,t;
        temp = array[left];//temp中存的就是基准数  让左边的都小于基准数 右边的都大于基准数
        i = left;
        j = right;

        while(i!=j){
            //顺序很重要，要先从右往左找
            while (array[j]>=temp&&i<j){
                j--;
            }
            while (array[i]<=temp&&i<j){
               i++;
            }
            if(i<j){
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        //最终将基准数归位
        array[left] = array[i];
        array[i] = temp;

        quickSort(left,i-1);
        quickSort(i+1,right);
    }

}
