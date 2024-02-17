package com.yunuspektas.behavioral.memento;

public class Memento {
    private  String durum;

    public Memento(String durum) {
        this.durum = durum;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
