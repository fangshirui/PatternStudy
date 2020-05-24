package com.chapter11_Composite_Pattern.good_sample;

// 图像文件类：叶子构件
public class ImageFile extends AbstractFile {

    public ImageFile(String name) {
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
        System.out.println("对图像文件 <" + name + "> 进行杀毒");
    }
}
