package com.yunuspektas.genel.association;

public class Musteri {
    private  String musterriAdi;
    private  String musteriSoyadi;

    @Override
    public String toString() {
        return "Musteri{" +
                "musterriAdi='" + musterriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                '}';
    }

    public Musteri(String musterriAdi, String musteriSoyadi) {
        this.musterriAdi = musterriAdi;
        this.musteriSoyadi = musteriSoyadi;
    }

    public String getMusterriAdi() {
        return musterriAdi;
    }

    public void setMusterriAdi(String musterriAdi) {
        this.musterriAdi = musterriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }
}
