package com.chapter3_singleton_pattern;

public class TaskManager {

    // 静态的实例，一个类只能有一个。static
    // 尽在类内部可见。 private
    private static TaskManager tm = null;

    // 将构造函数的可见性改为private 后, 在类的外部将不能使用new关键字来创建对象
    // 但在类的内部不受影响
    private TaskManager(){
        // 初始化程序
    }

    public void displayProcesses(){}
    public void displayServices(){}

    public static TaskManager getInstance(){
        if (tm == null){
            tm = new TaskManager();
        }
        return tm;
    }
}


