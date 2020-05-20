package com.chapter10_Bridge_Pattern.image_display;

public class BMPImage extends Image{
    public void parseFile(String filename) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(filename + "格式为BMP");
    }
}
