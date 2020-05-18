package com.chapter7_Prototype_Pattern.official_document_manager;

import java.util.Hashtable;

// 定义一个原型管理器，饿汉单例实现
public class PrototypeManager {
    // 用于储存原型对象
    private Hashtable ht = new Hashtable();

    private static PrototypeManager pm = new PrototypeManager();

    // 私有的构造函数
    private PrototypeManager(){
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }

    public static PrototypeManager getPrototypeManager(){
        return pm;
    }


    // 增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc){
        ht.put(key, doc);
    }

    // 通过浅克隆获得新的公文对象
    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument)ht.get(key)).clone();
    }

}
