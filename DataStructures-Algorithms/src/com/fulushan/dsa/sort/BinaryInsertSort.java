package com.fulushan.dsa.sort;

import java.util.Arrays;

/**
 * <折半插入排序>
 * Author fulushan
 * Created on 2017/8/9.
 * 交换排序：冒泡排序和快速排序
 * 时间复杂度 优化的冒泡排序法,时间复杂度为O(n2)
 */
public class BinaryInsertSort {

    static int  array[] = {1,10,60,55,40,33,100,15,78,80,180};
    public static void main(String[] args) {
        System.out.println("排序前:\n"+ Arrays.toString(array));
        BinaryInsertSort binaryInsertSort = new BinaryInsertSort();
        binaryInsertSort.binaryInsertSort();
        System.out.println("排序后:\n"+ Arrays.toString(array));
    }
    private void binaryInsertSort(){
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int low = 0;
            int high = i-1;
            while (low<=high){
                //找出中间的索引
                int mid = (low+high)/2;
                if(temp<array[mid]){
                    low = mid+1;//限定在索引大于mid的那一半中搜索
                }else{
                   high = mid-1;//限定在索引小于mid的那一半中搜索
                }
            }
            int j =i;
            for(;j>low;j--){ //将low到i处的所有数据向后移
                array[j] = array[j-1];
            }
            //插入合适的位置

            array[low] = temp;

        }

    }
}
