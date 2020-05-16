package com.chapter2.Dependency;
// 依赖关系


public class Driver {
    // 将Car对象作为drive方法的一个参数
    public void  drive(Car car){
        car.move();
    }
}
