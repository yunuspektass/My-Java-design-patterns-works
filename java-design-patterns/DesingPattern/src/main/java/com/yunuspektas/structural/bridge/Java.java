package com.yunuspektas.structural.bridge;

public class Java extends Yazilimci{

    //    parametresiz constructor
    public Java() {

    }

//    parametreli constructor

    public Java(ITeknolojiler iTeknolojiler, String yazilimciAdi) {
        super(iTeknolojiler, yazilimciAdi);
    }

    @Override
    public void kodlama() {
        System.out.println(getYazilimciAdi().concat(" Yunus Pektaş ").concat(getiTeknolojiler().teknolojiAdi().concat(" Java ")));
    }
}