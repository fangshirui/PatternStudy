package com.chapter15_Proxy_Pattern.DynamicProxy;

public class DocumentDAO implements AbstractDocumentDAO {
    @Override
    public void deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("d001")) {
            System.out.println("删除ID为" + documentId + "的文档信息成功！");
            return;
        }
        System.out.println("删除ID为" + documentId + "的文档信息失败!");
    }
}
