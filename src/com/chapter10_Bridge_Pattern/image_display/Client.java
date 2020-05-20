package com.chapter10_Bridge_Pattern.image_display;

public class Client {
    public static void main(String[] args) {
        // 设置文件格式 jpg
        Image image = new JPGImage();

        // 设置 所在系统
        ImageImp imp = new WindowsImp();

        // 桥接
        image.setImageImp(imp);

        // 解析文件
        image.parseFile("小龙女");
    }
}
