package com.yunuspektas.creational.abstractx.factory;

public class _MacAbstractFabrikasi implements  IBilgisayarAbstractFabrikasi{
    @Override
    public IBilgisayar getBilgisayar(String computerName) {
        return new Mac();
    }
}
