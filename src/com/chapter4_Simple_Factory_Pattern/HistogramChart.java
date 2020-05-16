package com.chapter4_Simple_Factory_Pattern;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.parser.JSONParser;

import java.sql.SQLOutput;

//具体产品类
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("创建柱状图!");
    }

    public void display() {
        System.out.println("显示柱状图!");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }


}
