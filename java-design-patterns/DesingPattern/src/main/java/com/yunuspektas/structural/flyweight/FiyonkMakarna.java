package com.yunuspektas.structural.flyweight;

public class FiyonkMakarna extends  Makarna{

    public FiyonkMakarna(double makarnaFiyati , double makarnaUzunlugu) {

        this.makarnaCinsi = MakarnaCinsi.fiyonk;
        this.makarnaFiyati = makarnaFiyati;
        this.makarnaUzunugu = makarnaUzunlugu;
    }

    @Override
    public void makarnaUret(String unMiktari, String yagMiktari, int yumurtaSayisi) {
        System.out.println("Fiyonk Makarna Tarif: " + "  un: " + unMiktari + " yağ: " + yagMiktari + " yumurta: " + yumurtaSayisi);
    }
}
