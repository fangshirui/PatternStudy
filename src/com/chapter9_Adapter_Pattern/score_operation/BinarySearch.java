package com.chapter9_Adapter_Pattern.score_operation;
// 适配者
public class BinarySearch {
    // array数组是已经排序好的。
    public boolean binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            int midVal = array[mid];

            if (midVal > key){
                high = mid -1;
            }
            else if(midVal < key){
                low = mid + 1;
            }else{
                return true;
            }
        }
        return  false;
    }
}
