package com.fulushan.dsa.sort;

import java.util.Arrays;

/**
 * <直接插入排序>
 * Author fulushan
 * Created  on 17/8/9.
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

    }


}
