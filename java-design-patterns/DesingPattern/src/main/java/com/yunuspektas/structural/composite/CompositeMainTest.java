package com.yunuspektas.structural.composite;

public class CompositeMainTest {
    public static void main(String[] args) {
        AcemiBirligi acemiBirligi = new AcemiBirligi("İstanbul");
        AcemiBirligi acemiBirligi2 = new AcemiBirligi("İstanbul2");

        UstaBirligi ustaBirligi = new UstaBirligi("Giresun");

        System.out.println("*************************");
        ustaBirligi.ekle(acemiBirligi);

        ustaBirligi.ekle(acemiBirligi2);
        ustaBirligi.askerAdimAt();
    }
}
