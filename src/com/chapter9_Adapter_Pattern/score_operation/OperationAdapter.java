package com.chapter9_Adapter_Pattern.score_operation;

public class OperationAdapter implements ScoreOperation{
    private QuickSort quickSortObj;
    private BinarySearch binarySearchObj;

    public OperationAdapter(){
        quickSortObj = new QuickSort();
        binarySearchObj = new BinarySearch();
    }
    public int[] sort(int[] array) {
        return quickSortObj.quickSort(array);
    }

    public boolean search(int[] array, int key) {
        return binarySearchObj.binarySearch(array, key);
    }

    public void test(){}
}
