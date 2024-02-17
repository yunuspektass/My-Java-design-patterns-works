package com.yunuspektas.behavioral.template;

public class TemplateMainTest {
    public static void main(String[] args) {
        Okul okul = new OzelSektor();
        okul.mezun();

        System.out.println("*************************");


        okul = new Devlet();
        okul.mezun();
    }
}
