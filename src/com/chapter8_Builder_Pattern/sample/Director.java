package com.chapter8_Builder_Pattern.sample;

//导演类
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return  builder.getResult();
    }
}
