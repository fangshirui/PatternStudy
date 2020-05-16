package com.chapter4_Simple_Factory_Pattern;

abstract class Product {
    // 所有产品的公共业务方法
    public void methodSame(){}

    // 声明抽象业务方法
    public abstract void methodDiff();
}

