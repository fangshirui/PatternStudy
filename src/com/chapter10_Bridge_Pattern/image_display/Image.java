package com.chapter10_Bridge_Pattern.image_display;

// 抽象图像类
abstract class Image {
    protected ImageImp imp;
    public void setImageImp(ImageImp imp){
        this.imp = imp;
    }

    public abstract void parseFile(String filename);
}
