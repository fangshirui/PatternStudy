package com.chapter5_Factory_Method_Pattern;

// 文件日志记录器：具体产品2
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
