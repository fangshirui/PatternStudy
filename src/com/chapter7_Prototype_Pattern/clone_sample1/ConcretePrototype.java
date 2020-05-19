package com.chapter7_Prototype_Pattern.clone_sample1;

public class ConcretePrototype implements Prototype{
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public ConcretePrototype clone() {
        ConcretePrototype prototype;
        prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }
}
