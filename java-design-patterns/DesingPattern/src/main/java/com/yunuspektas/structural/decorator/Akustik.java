package com.yunuspektas.structural.decorator;

public class Akustik extends DecoratorKeman {
//    yeni özellikler
    private String akustikSesEklendi;

//parametreli constructor
    public Akustik(IKeman iKeman , String akustikSesEklendi) {
        super(iKeman);
        this.akustikSesEklendi = akustikSesEklendi;
    }

    @Override
    public String kemanYap() {
        return super.kemanYap() + akustikSesEklendi;
    }
}
