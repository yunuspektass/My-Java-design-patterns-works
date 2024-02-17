package com.yunuspektas.structural.bridge;

abstract public class Yazilimci {
    private ITeknolojiler iTeknolojiler = null;
    private String yazilimciAdi = "";

//    parametresiz constructor
    public Yazilimci(){

    }

//  parametreli constructor

    public Yazilimci(ITeknolojiler iTeknolojiler, String yazilimciAdi) {
        this.iTeknolojiler = iTeknolojiler;
        this.yazilimciAdi = yazilimciAdi;
    }

//    gövdesiz metodlar
    abstract public void kodlama();

//    getter and setter


    public ITeknolojiler getiTeknolojiler() {
        return iTeknolojiler;
    }

    public void setiTeknolojiler(ITeknolojiler iTeknolojiler) {
        this.iTeknolojiler = iTeknolojiler;
    }

    public String getYazilimciAdi() {
        return yazilimciAdi;
    }

    public void setYazilimciAdi(String yazilimciAdi) {
        this.yazilimciAdi = yazilimciAdi;
    }

    @Override
    public String toString() {
        return "Yazilimci{" +
                "iTeknolojiler=" + iTeknolojiler +
                ", yazilimciAdi='" + yazilimciAdi + '\'' +
                '}';
    }
}
