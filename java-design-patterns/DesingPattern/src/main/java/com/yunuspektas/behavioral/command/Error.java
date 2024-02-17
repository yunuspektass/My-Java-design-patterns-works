package com.yunuspektas.behavioral.command;

public class Error implements  LoglamaOrnegi{
    @Override
    public String loglamaTuru(String ulke, String sehir) {
        System.out.println("Error");
        return "error ÜLKE : "+ ulke  + " ŞEHİR : "+ sehir;
    }
}
