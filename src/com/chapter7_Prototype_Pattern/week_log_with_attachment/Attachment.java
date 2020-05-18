package com.chapter7_Prototype_Pattern.week_log_with_attachment;

public class Attachment {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，名为" + name);
    }
}
