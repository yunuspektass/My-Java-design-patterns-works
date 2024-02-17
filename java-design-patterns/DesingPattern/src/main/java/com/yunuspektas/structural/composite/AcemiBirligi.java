package com.yunuspektas.structural.composite;

public class AcemiBirligi implements IAsker{

    private  String acemiBirlikAdi;

    public AcemiBirligi(String acemiBirlikAdi) {
        this.acemiBirlikAdi = acemiBirlikAdi;
    }

    @Override
    public void askerAdimAt() {
        System.out.println(acemiBirlikAdi);
        System.out.println("Acemi birliği adım atıyorum");
    }
}
