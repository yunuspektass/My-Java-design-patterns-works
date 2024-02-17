package com.yunuspektas.genel.inheritance;

public class Pektas extends Person{
    private String muhendis;

    public Pektas(String adi, String soyadi , String muhendis) {
        super(adi, soyadi);
        this.muhendis=muhendis;
    }
}
