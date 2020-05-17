package com.chapter4_Simple_Factory_Pattern;

import org.w3c.dom.NodeList;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

public class XMLUtil {
    public static String getChartType(){
        try{
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/com/chapter4_Simple_Factory_Pattern/config.xml"));

            // 获取包含图表类型的节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
