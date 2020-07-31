package com.chapter15_Proxy_Pattern.DynamicProxy;


// 抽象UserDAO：抽象主题角色
public interface AbstractUserDAO {
    void findUserById(String id);
}
