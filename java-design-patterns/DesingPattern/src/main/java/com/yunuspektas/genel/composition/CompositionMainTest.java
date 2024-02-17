package com.yunuspektas.genel.composition;

import java.util.ArrayList;

public class CompositionMainTest {
    public static void main(String[] args) {
 //yazar kitap , tekil olanlar genelde başa yazılır
//Composition yapısı birbirine tamamen bağlı yapıları ifade eder
//Biri olmazsa diğeri olmayan yapılardır.
        Yazar yazar = new Yazar("Yunus Pektaş");
        yazar.setKitapList(new ArrayList<Kitap>());

        Kitap kitap = new Kitap("Servlet");
        kitap.setYazar(yazar);
        kitap.getYazar().getKitapList().add(kitap);

        Kitap kitap2 = new Kitap("Spring Boot");
        kitap2.setYazar(yazar);
        kitap2.getYazar().getKitapList().add(kitap2);

        System.out.println("*********************");
        System.out.println(yazar);

        for (Kitap temp : kitap2.getYazar().getKitapList()){
            System.out.println(temp);
        }






    }
}
