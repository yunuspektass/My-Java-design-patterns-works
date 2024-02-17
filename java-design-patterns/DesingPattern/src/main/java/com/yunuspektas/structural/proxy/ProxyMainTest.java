package com.yunuspektas.structural.proxy;

public class ProxyMainTest {
    public static void main(String[] args) {
        SuperAdminProxy superAdminProxy = new SuperAdminProxy("yunus@gmail.com" , "root");
//        SuperAdminProxy superAdminProxy = new SuperAdminProxy("deneme@gmail.com" , "deneme");

        String special = superAdminProxy.getComputerCode();
        System.out.println(special);
    }
}
