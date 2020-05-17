package com.chapter4_Simple_Factory_Pattern;

public class Factory {
    // 静态工厂方法
    public static Product getProduct(String arg){
        Product product = null;
        if (arg.equalsIgnoreCase("A")){
            product = new ConcreteProductA();
        }else if(arg.equalsIgnoreCase("B")){
            product = new ConcreteProductB();
        }
        return product;
    }
}
