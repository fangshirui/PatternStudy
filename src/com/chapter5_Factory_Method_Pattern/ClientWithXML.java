package com.chapter5_Factory_Method_Pattern;

public class ClientWithXML {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory)XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
