package com.yunuspektas.structural.bridge;

public class Html5 extends Yazilimci{

//    parametresiz constructor
    public Html5() {

    }

//    parametreli constructor

    public Html5(ITeknolojiler iTeknolojiler, String yazilimciAdi) {
        super(iTeknolojiler, yazilimciAdi);
    }

    @Override
    public void kodlama() {
        System.out.println(getYazilimciAdi().concat(" Yunus Pektaş ").concat(getiTeknolojiler().teknolojiAdi().concat(" Html5 ")));
    }
}
