package com.chapter10_Bridge_Pattern.image_display;

// 抽象操作系统实现类：实现类接口
public interface ImageImp {
    // 显示像素矩阵，不同操作系统的具体实现不同。
    public void doPaint(Matrix m);
}
