package com.chapter3_singleton_pattern;

import java.util.*;

// 负载均衡器 单例类
public class LoadBalancer {
    // 私有静态成员变量，存储唯一实例
    private static LoadBalancer instance = new LoadBalancer();

    // 服务器集合
    // 这里的List 是接口类
    private List serverList = null;

    // 私有构造函数
    private LoadBalancer(){
        serverList = new ArrayList(); // ArrayList 是一个顺序表实现类
    }

    // 公有静态成员方法，返回唯一实例
    public static LoadBalancer getLoadBalancer(){
        return instance;
    }

    // 增加服务器
    public void addServer(String server){
        serverList.add(server);
    }

    // 删除服务器
    public void removeServer(String server){
        serverList.remove(server);
    }

    // 使用Random类在已有服务器列表中随机获得一个服务器名
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}




