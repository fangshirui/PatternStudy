package com.chapter11_Composite_Pattern.good_sample;

// 文本文件类：叶子构件
public class TextFile extends AbstractFile{

    public TextFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("不支持");

    }

    public void remove(AbstractFile file) {
        System.out.println("不支持");

    }

    public AbstractFile getChild(int i) {
        System.out.println("不支持");
        return null;
    }

    public void killVirus() {
        System.out.println("对文本文件 <" + name + "> 进行杀毒");

    }
}
