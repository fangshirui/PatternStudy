package com.chapter5_Factory_Method_Pattern;

// 数据库日志记录器：具体产品1
public class DatabaseLogger implements Logger{

    public void writeLog() {
        System.out.println("数据库日志记录。");

    }
}
