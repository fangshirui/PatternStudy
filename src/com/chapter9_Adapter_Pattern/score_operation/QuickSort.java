package com.chapter9_Adapter_Pattern.score_operation;

import static java.util.Arrays.sort;

// 快速排序类：适配者类
public class QuickSort {
    public int[] quickSort(int[] array){
        sort(array, 0, array.length - 1);
        return array;
    }
}


