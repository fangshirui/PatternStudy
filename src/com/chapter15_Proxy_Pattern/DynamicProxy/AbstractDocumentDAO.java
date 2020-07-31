package com.chapter15_Proxy_Pattern.DynamicProxy;

// 抽象DocumentDAO；抽象主题角色
public interface AbstractDocumentDAO {
    void deleteDocumentById(String documentId);
}
