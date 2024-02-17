package com.yunuspektas.genel.composition;

import java.io.Serializable;

// N tane yazdığı kitap
public class Kitap implements Serializable {
    private String  kitapAdi;
    //composition : has-a

    private Yazar yazar;


    public Kitap(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    @Override
    public String toString() {
        return "kitapAdi = " + kitapAdi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}
