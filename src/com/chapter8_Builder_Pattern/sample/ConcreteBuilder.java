package com.chapter8_Builder_Pattern.sample;

// 具体建造者
public class ConcreteBuilder extends Builder{
    public void buildPartA() {
        product.setPartA("建造A部分");
    }

    public void buildPartB() {
        product.setPartB("建造B部分");
    }

    public void buildPartC() {
        product.setPartC("建造C部分");
    }
}
