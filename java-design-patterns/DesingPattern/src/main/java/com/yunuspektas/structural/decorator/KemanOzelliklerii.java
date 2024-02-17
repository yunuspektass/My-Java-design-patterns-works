package com.yunuspektas.structural.decorator;

public class KemanOzelliklerii implements IKeman{
    private int telSayisi;
    private  int burguSayisi;

//    parametreli  constructor
    public KemanOzelliklerii(int telSayisi, int burguSayisi) {
        this.telSayisi = telSayisi;
        this.burguSayisi = burguSayisi;
    }

    @Override
    public String kemanYap() {
        return this.telSayisi + " " + burguSayisi;
    }
}
