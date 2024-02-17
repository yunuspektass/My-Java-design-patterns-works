package com.yunuspektas.creational.factory;

public class FactoryMainTest {
    public static void main(String[] args) {
       IBilgisayar msiBilgisayar =  BilgisayarFabrikasi.getBilgisayar("msi");
        System.out.println(msiBilgisayar);

        System.out.println("****************************************************************");

       IBilgisayar macBilgisayar = BilgisayarFabrikasi.getBilgisayar("mac");
        System.out.println(macBilgisayar);
    }
}
