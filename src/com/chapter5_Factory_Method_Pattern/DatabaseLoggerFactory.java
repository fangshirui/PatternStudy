package com.chapter5_Factory_Method_Pattern;
// 数据库日志记录器工厂类：具体工厂1
public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        // 连接数据库，代码省略

        // 创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();

        // 初始化数据库日志记录器，代码省略

        return logger;
    }
}
