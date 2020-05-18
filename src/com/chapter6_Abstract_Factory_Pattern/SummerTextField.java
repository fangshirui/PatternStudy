package com.chapter6_Abstract_Factory_Pattern;
// Summer 文本框类：具体产品
public class SummerTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示蓝色文本框");
    }
}
