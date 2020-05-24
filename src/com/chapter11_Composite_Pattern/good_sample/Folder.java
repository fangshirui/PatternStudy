package com.chapter11_Composite_Pattern.good_sample;

import java.util.ArrayList;

// 文件夹类：容器构件
public class Folder extends AbstractFile {

    // 定义集合fileList 储存AbstractFile 类成员
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    public void killVirus() {
        System.out.println("---对文件夹 <" + name + "> 进行杀毒----");
        for (AbstractFile obj : fileList) {
            obj.killVirus();
        }

    }
}
