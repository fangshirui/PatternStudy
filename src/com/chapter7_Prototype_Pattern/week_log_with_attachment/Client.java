package com.chapter7_Prototype_Pattern.week_log_with_attachment;

public class Client {
    public static void main(String[] args) {
        WeekLog log_pre, log_new;
        log_pre = new WeekLog();
        Attachment attachment = new Attachment();
        log_pre.setAttachment(attachment);

        log_new = log_pre.clone();
        System.out.println("周报是否相同（是否分配了不同地址）"
                + (log_new == log_pre) );
        System.out.println("附件是否相同（是否分配了不同地址) "
                + (log_new.getAttachment() == log_pre.getAttachment()));
//        System.out.println(attachment == log_new.getAttachment());
    }

}

// 输出
//周报是否相同（是否分配了不同地址）false
//附件是否相同（是否分配了不同地址) true
//
// 这说明默认的clone方法是浅拷贝（浅克隆）。
