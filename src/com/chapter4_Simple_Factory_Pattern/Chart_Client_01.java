package com.chapter4_Simple_Factory_Pattern;

public class Chart_Client_01 {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
