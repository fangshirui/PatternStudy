package com.chapter2.Association;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
