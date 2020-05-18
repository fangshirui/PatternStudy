package com.chapter6_Abstract_Factory_Pattern;
// Spring文本框类：具体产品
public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示绿色文本框");
    }
}
