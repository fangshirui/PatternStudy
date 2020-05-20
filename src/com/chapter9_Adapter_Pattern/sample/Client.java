package com.chapter9_Adapter_Pattern.sample;

// 客户端
public class Client {
    public static void main(String[] args) {
        Target a = new Adapter();
        a.request();
    }
}
