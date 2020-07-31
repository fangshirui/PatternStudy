package com.chapter15_Proxy_Pattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        InvocationHandler handler;

        AbstractUserDAO userDAO = new UserDAO();

        handler = new DAOLogHandler(userDAO);

        AbstractUserDAO proxy;

        // 动态创建代理对象。
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),
                new Class[]{AbstractUserDAO.class}, handler);

        proxy.findUserById("张无忌");

        // 再来一遍，这次创建的是另一个类的代理类，但是没有修改任何代码，也没有添加新的代理类
        // 新的代理类是自动生成的，利用的是以上共同的代码

        // 所以动态代理解决的问题是，当代理解决的事务相同时，可以使用动态代理，给每个不同的类，都能添加相同的事务代理。
        // 而与此同时，不必修改添加代码，只需在客户端代码添加需要的代理类即可


        AbstractDocumentDAO documentDAO = new DocumentDAO();  // 真实类
        handler = new DAOLogHandler(documentDAO);   // 代理处理程序  - 针对某个真实类

        AbstractDocumentDAO proxy_document;

        // 动态生成对应的代理类
        proxy_document = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),
                new Class[]{AbstractDocumentDAO.class}, handler);

        proxy_document.deleteDocumentById("D01");


    }
}
