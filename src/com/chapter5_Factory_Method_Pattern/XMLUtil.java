package com.chapter5_Factory_Method_Pattern;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.SAXException;

public class XMLUtil {
    public static Object getBean(){
        try{
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/com/chapter5_Factory_Method_Pattern/config.xml"));

            // 获取包含图表类型的节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue().trim();
            System.out.println(cName);

            // 通过类名生成实例对象并返回
            Class c = Class.forName(cName);
            System.out.println(c.getSimpleName());
            Object obj = c.newInstance();
            return obj;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
