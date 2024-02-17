package com.yunuspektas.creational.abstractx.factory;

public class AbstractFactoryMainTest {
    public static void main(String[] args) {
        _MacAbstractFabrikasi mac = new _MacAbstractFabrikasi();
        IBilgisayar bilgisayar1 = mac.getBilgisayar("mac");
        System.out.println(bilgisayar1);

        System.out.println("****************************************");

        _MsiAbstractFabrikasi msi = new _MsiAbstractFabrikasi();
        IBilgisayar bilgisayar2 = msi.getBilgisayar("msi");
        System.out.println(bilgisayar2);

    }
}
