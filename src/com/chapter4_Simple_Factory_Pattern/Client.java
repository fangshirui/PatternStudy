package com.chapter4_Simple_Factory_Pattern;

public class Client {
    public static void main(String[] args) {
        Product product;
        product = Factory.getProduct("A");
        product.methodDiff();
        product.methodSame();
    }
}
