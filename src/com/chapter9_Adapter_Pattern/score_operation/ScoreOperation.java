package com.chapter9_Adapter_Pattern.score_operation;
// 抽象成绩操作类：抽象接口
interface ScoreOperation {
    public int[] sort(int[] array);
    public boolean search(int array[], int key);
}
