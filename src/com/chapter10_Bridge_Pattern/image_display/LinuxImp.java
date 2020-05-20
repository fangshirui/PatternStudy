package com.chapter10_Bridge_Pattern.image_display;

// linux 系统实现类
public class LinuxImp implements ImageImp {
    public void doPaint(Matrix m) {
        System.out.println("在Linux操作系统中显示图像:");
    }
}
