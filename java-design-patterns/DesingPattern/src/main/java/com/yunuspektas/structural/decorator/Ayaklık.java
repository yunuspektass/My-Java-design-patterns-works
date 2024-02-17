package com.yunuspektas.structural.decorator;

public class Ayaklık extends  DecoratorKeman{
    private String ayaklikEklendi;

    //parametreli constructor
    public Ayaklık(IKeman iKeman , String ayaklikEklendi) {
        super(iKeman);
        this.ayaklikEklendi = ayaklikEklendi;
    }

    @Override
    public String kemanYap() {
        return super.kemanYap() + ayaklikEklendi;
    }
}
