package com.yunuspektas.behavioral.command;

public class CommandMainTest {
    public static void main(String[] args) {
        String error = Command.result(new Error() , "Türkiye" , "İstanbul");
        System.out.println(error);

        System.out.println("***************************************");

        String warning = Command.result(new Warning() , "Türkiye" , "İstanbul");
        System.out.println(warning);
    }
}
