package com.chapter4_Simple_Factory_Pattern;


public class Chart_Client_02 {
    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
