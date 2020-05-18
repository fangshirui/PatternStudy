package com.chapter7_Prototype_Pattern.week_log_with_attachment;

public class WeekLog implements Cloneable{

    // Attachment与WeekLog的关系是关联中的聚合关系
    private Attachment attachment;
    private String name;
    private String date;
    private String content;


    public void setAttachment(Attachment attachment){
        this.attachment = attachment;
    }
    public Attachment getAttachment(){
        return attachment;
    }

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
        Object obj;
        try{
            obj = super.clone(); // 父类的克隆方法
            return (WeekLog)obj;
        }
        catch (CloneNotSupportedException e ){
            System.out.println("不支持复制");
            return null;
        }
    }

}
