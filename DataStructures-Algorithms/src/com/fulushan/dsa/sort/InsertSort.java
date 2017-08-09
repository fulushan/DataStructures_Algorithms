package com.fulushan.dsa.sort;

import java.util.Arrays;

/**
 * <直接插入排序>
 * Author fulushan
 * Created  on 17/8/9.
 * 时间复杂度 O(n2)
 */
public class InsertSort {

    static int  array[] = {1,10,60,55,40,33,100,15,78,80,180};
    public static void main(String[] args) {

        System.out.println("排序前:\n"+ Arrays.toString(array));
        InsertSort quickSort = new InsertSort();
        quickSort.insertSort();
        System.out.println("排序后:\n"+ Arrays.toString(array));
    }

    private  void insertSort(){

        for(int i=1;i<array.length;i++){
            int temp = array[i];
            if(array[i]<array[i-1]){//需要插入了
                int j =i-1;
                for(;j>0&&array[j]>temp;j--){ //前面的数据 记录后移
                    array[j+1] = array[j];
                }
                //插入合适的位置

                array[j+1] = temp;
            }
        }

    }


}
