package com.yunuspektas.genel.abstraction.abstractx;

import java.util.Date;

abstract public class YayliCalgilar {
    private String adi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    //Gövdeli method
    public void deneme(){
        System.out.println("Deneme");
    }

   //Gövdesiz method
    abstract String laptopAdi();
    abstract String laptopFiyati();
    abstract  public  void bilgisayarUretim(Date tarih);
}
