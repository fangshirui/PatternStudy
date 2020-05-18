package com.chapter6_Abstract_Factory_Pattern;

// Spring 组合框类：具体产品
public class SpringComBox implements ComboBox{
    @Override
    public void display() {
        System.out.println("显示绿色组合框");
    }
}
