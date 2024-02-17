package com.yunuspektas.behavioral.command;

public class Warning implements  LoglamaOrnegi {
    @Override
    public String loglamaTuru(String ulke, String sehir) {
        System.out.println("Warning");
        return "Warning ÜLKE : " + ulke + " ŞEHİR : " + sehir;
    }
}