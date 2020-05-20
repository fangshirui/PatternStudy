package com.chapter10_Bridge_Pattern.image_display;

// PNG格式图像：扩充抽象类
public class PNGImage extends Image{
    public void parseFile(String filename) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(filename + ",格式为PNG");
    }
}
