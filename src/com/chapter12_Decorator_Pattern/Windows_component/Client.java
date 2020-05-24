package com.chapter12_Decorator_Pattern.Windows_component;

public class Client {
    public static void main(String[] args) {
        // 添加抽象构件定义
        Component component, componentSB, comSBB;
        // 定义具体构件
        component = new Window();

        componentSB = new ScrollBarDecorator(component);

        componentSB.display();

        // 装饰类不仅可以注入具体构件类
        // 装饰类还可以注入具体装饰类获得拓展！
        // 这是它与桥接模式不同地方之一
        comSBB  = new BlackBorderDecorator(componentSB);
        comSBB.display();
    }
}
