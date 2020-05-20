package com.chapter9_Adapter_Pattern.score_operation;

public class Client {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96};
        int[] result;



        System.out.println("成绩排序结果:");
        result = operation.sort(scores);
        for (int i : result){
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("是否有成绩91：" + operation.search(scores, 91));
    }
}
