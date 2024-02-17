package com.yunuspektas.behavioral.mediator;

public class MediatorMainTest {
    public static void main(String[] args) {
        Student yunus  = new Student("Yunus");
        yunus.mesajGonder(" Nasılsın Yunus");

        System.out.println("***************************");

        Student sude = new Student("Sude");
        sude.mesajGonder(" Nasılsın Sude");

    }


}
