package com.chapter4_Simple_Factory_Pattern;

public class PieChart implements Chart{
    public PieChart(){
        System.out.println("创建饼状图!");
    }
    @Override
    public void display() {
        System.out.println("显示饼状图!");
    }
}


