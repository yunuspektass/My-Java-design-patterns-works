package com.yunuspektas.creational.abstractx.factory;

public class _MsiAbstractFabrikasi implements IBilgisayarAbstractFabrikasi {
    @Override
    public IBilgisayar getBilgisayar(String computerName) {
        return new Msi();
    }
}
