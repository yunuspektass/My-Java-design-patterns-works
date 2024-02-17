package com.yunuspektas.structural.flyweight;

public class FlyWeightMainTest {
    public static void main(String[] args) {
        MakarnaHavuzu makarnaHavuzu = new MakarnaHavuzu();

        Makarna makarna1 =makarnaHavuzu.getMakarna(MakarnaCinsi.fiyonk);
        makarna1.makarnaUret("100gr" , "10gr" , 10 );

        Makarna makarna2 =makarnaHavuzu.getMakarna(MakarnaCinsi.fiyonk);
        makarna2.makarnaUret("200gr" , "20gr" , 10 );


        Makarna makarna3 =makarnaHavuzu.getMakarna(MakarnaCinsi.kelebek);
        makarna3.makarnaUret("300gr" , "30gr" , 10 );


        Makarna makarna4 =makarnaHavuzu.getMakarna(MakarnaCinsi.kelebek);
        makarna4.makarnaUret("10gr" , "10gr" , 10 );


        Makarna makarna5 =makarnaHavuzu.getMakarna(MakarnaCinsi.kelebek);
        makarna5.makarnaUret("20gr" , "20gr" , 10 );

        Makarna makarna6=makarnaHavuzu.getMakarna(MakarnaCinsi.fetucini);
        makarna6.makarnaUret("20gr" , "20gr" , 10 );



    }
}
