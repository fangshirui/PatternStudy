package com.chapter6_Abstract_Factory_Pattern;

// 界面皮肤工厂接口：抽象工厂
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}

