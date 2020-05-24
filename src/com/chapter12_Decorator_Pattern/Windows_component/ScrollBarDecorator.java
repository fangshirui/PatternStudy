package com.chapter12_Decorator_Pattern.Windows_component;

// 滚动条装饰类 具体装饰类
public class ScrollBarDecorator extends ComponentDecorator{

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        super.display();
        setScrollBar();
    }

    public void setScrollBar(){
        System.out.println("为构件添加滚动条");
    }
}
