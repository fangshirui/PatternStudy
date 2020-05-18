package com.chapter6_Abstract_Factory_Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(){
        try{
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/com/chapter6_Abstract_Factory_Pattern/config.xml"));

            // 获取包含图表类型的节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue().trim();

            // 通过类名生成实例对象并返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
