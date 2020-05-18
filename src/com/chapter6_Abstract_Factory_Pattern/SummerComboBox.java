package com.chapter6_Abstract_Factory_Pattern;

// Summer组合框类：具体产品
public class SummerComboBox implements ComboBox{
    @Override
    public void display() {
        System.out.println("显示蓝色组合框");
    }
}
