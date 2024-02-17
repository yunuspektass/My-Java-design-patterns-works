package com.yunuspektas.genel.association;

public class Banka {
    private String bankaAdi;
    private String bankaAdresi;

    @Override
    public String toString() {
        return "Banka{" +
                "bankaAdi='" + bankaAdi + '\'' +
                ", bankaAdresi='" + bankaAdresi + '\'' +
                '}';
    }

    public Banka(String bankaAdi, String bankaAdresi) {
        this.bankaAdi = bankaAdi;
        this.bankaAdresi = bankaAdresi;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getBankaAdresi() {
        return bankaAdresi;
    }

    public void setBankaAdresi(String bankaAdresi) {
        this.bankaAdresi = bankaAdresi;
    }
}
