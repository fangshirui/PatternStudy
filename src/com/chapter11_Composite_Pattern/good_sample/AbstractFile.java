package com.chapter11_Composite_Pattern.good_sample;

// 抽象构件
abstract class AbstractFile {
    protected String name;

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}


