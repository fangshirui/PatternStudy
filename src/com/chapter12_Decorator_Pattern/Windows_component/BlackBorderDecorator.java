package com.chapter12_Decorator_Pattern.Windows_component;

// 黑色边框装饰类
public class BlackBorderDecorator extends ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        super.display();
        setBlackBorder();
    }

    public void setBlackBorder(){
        System.out.println("为构件添加黑色边框");
    }
}
