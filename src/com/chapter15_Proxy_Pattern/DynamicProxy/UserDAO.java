package com.chapter15_Proxy_Pattern.DynamicProxy;


// 具体UserDAO类，真实角色
public class UserDAO implements AbstractUserDAO {
    @Override
    public void findUserById(String id) {
        // equalsIgnoreCase可以忽略大小写导致的不同
        if (id.equalsIgnoreCase("张无忌")) {
            System.out.println("查询ID为" + id + "的用户信息成功！");
            return;
        }

        System.out.println("查询ID为" + id + "的用户信息失败！");
    }
}
