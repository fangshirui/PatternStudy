package com.chapter3_singleton_pattern;

public class Client {
    public static void main(String[] args){
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4){
            System.out.println("服务器负载均衡器具有唯一性");
        }

        balancer1.addServer("Server1");
        balancer1.addServer("Server2");
        balancer1.addServer("Server3");
        balancer1.addServer("Server4");

        // 模拟客户端请求的分发
        for (int i = 0; i < 10; i++){
            String server = balancer1.getServer();
            System.out.println("分发请求到服务器:" + server);
        }

    }
}
