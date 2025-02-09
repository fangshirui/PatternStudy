package com.chapter8_Builder_Pattern.sample;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        Product product = director.construct();

        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());
    }
}
