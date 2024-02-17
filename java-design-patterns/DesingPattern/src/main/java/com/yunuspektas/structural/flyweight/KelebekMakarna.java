package com.yunuspektas.structural.flyweight;

public class KelebekMakarna extends Makarna{
    public KelebekMakarna(double makarnaFiyati , double makarnaUzunlugu) {

        this.makarnaCinsi = MakarnaCinsi.kelebek;
        this.makarnaFiyati = makarnaFiyati;
        this.makarnaUzunugu = makarnaUzunlugu;
    }
    @Override
    public void makarnaUret(String unMiktari, String yagMiktari, int yumurtaSayisi) {
        System.out.println("Kelebek Makarna Tarif: " + "  un: " + unMiktari + " yağ: " + yagMiktari + " yumurta: " + yumurtaSayisi);
    }
}

