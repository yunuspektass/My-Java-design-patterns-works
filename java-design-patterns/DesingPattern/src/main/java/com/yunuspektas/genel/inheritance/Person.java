package com.yunuspektas.genel.inheritance;

public class Person {
    private String adi;
    private String soyadi;

    public Person(String adi , String soyadi){
        this.adi = adi;
        this.soyadi = soyadi;
    }

//getter and setter

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
}
