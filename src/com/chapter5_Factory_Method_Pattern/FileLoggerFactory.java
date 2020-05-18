package com.chapter5_Factory_Method_Pattern;
// 文件日志记录器工厂类：具体工厂2
public class FileLoggerFactory implements LoggerFactory {
    public FileLoggerFactory(){

    }
    public Logger createLogger() {
        // 创建文件日志记录器对象
        Logger  logger = new FileLogger();

        // 创建文件，代码省略

        return logger;
    }
}
