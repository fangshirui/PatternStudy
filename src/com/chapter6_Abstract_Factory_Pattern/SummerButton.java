package com.chapter6_Abstract_Factory_Pattern;
// Summer 按钮类：具体产品
public class SummerButton implements Button{
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
