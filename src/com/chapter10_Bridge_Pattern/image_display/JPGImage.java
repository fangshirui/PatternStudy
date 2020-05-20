package com.chapter10_Bridge_Pattern.image_display;

public class JPGImage extends Image{
    public void parseFile(String filename) {
        // 模拟解析Jpg文件，并获得一个像素矩阵对象m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(filename + ", 格式为JPG");
    }
}
