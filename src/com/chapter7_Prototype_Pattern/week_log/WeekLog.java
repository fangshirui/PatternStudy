package com.chapter7_Prototype_Pattern.week_log;

public class WeekLog implements Cloneable{

    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WeekLog clone(){
        Object obj = null;
        try{
            obj = super.clone(); // 父类的克隆方法
            return (WeekLog)obj;
        }
        catch (CloneNotSupportedException e ){
            System.out.println("不支持复制");
            return null;
        }
    }

    public void print_log(){
        System.out.println("****周报****");
        System.out.println("周次：" + date);
        System.out.println("姓名：" + name);
        System.out.println("内容：" + content + "\n");
    }
}
