package com.chapter9_Adapter_Pattern.sample;

public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(){
        adaptee = new Adaptee();
    }

    public void request() {
        adaptee.specificRequest();
    }
}
