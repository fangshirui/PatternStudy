package com.chapter7_Prototype_Pattern.official_document_manager;

public abstract class OfficialDocument implements Cloneable {

    public OfficialDocument clone(){
        OfficialDocument doc = null;
        try{
            doc = (OfficialDocument)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("不支持复制");
        }
        return doc;
    }
    public abstract void display();
}
