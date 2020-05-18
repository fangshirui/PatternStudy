package com.chapter7_Prototype_Pattern.official_document_manager;

public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPrototypeManager();

        OfficialDocument doc1, doc2, doc3, doc4;

        doc1 = pm.getOfficialDocument("far");
        doc2 = doc1.clone();
        doc1.display();
        doc2.display();

        doc3 = pm.getOfficialDocument("srs");
        doc4 = doc3.clone();
        doc3.display();
        doc4.display();

        System.out.println(doc1 == doc2);
        System.out.println(doc3 == doc4);
    }
}
