package com.chapter10_Bridge_Pattern.image_display;

public class WindowsImp implements ImageImp{
    public void doPaint(Matrix m){
        // 调用windows绘制函数绘制像素矩阵
        System.out.println("在Windows操作系统中显示图像：");
    }
}
