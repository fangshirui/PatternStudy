package com.chapter6_Abstract_Factory_Pattern;

public class SkinClient {
    public static void main(String[] args) {
        SkinFactory factory;

        Button bt;
        TextField tf;
        ComboBox cb;

        factory = (SkinFactory)XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();

        bt.display();
        tf.display();
        cb.display();
    }
}
