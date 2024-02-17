package com.yunuspektas.creational.singleton;

public class SingletonMainTest {
    public static void main(String[] args) {
//        new ile oluşturamazsın
//        SingletonDbConnection singletonDbConnection = new SingletonDbConnection();

        SingletonDbConnection.getInstance();
        SingletonDbConnection.getInstance2();
    }
}
