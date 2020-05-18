package com.chapter7_Prototype_Pattern.week_log;

public class Client {

    public static void main(String[] args) {

        WeekLog log_previous = new WeekLog();

        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周很忙，每天加班！");

        log_previous.print_log();

        WeekLog log_new = log_previous.clone();
        log_new.setDate("第13周");

        log_new.print_log();
        log_previous.print_log();

    }
}
