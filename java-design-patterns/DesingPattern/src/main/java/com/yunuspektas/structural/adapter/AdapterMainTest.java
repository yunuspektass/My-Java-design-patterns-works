package com.yunuspektas.structural.adapter;

public class AdapterMainTest {
    public static void main(String[] args) {

// Farklı bileşenleri tek bir interface'de birleştirdik
        System.out.println("**************************");


        ITurkMutfagi iTurkMutfagi = new GiresunMutfagi();
        iTurkMutfagi.yemekYap();

        System.out.println("**************************");

       iTurkMutfagi = new AntepMutfagi();
        iTurkMutfagi.yemekYap();

        System.out.println("**************************");

        HintMutfagi hintMutfagi = new HintMutfagi();

        iTurkMutfagi = new HintMutfagiAdapter(hintMutfagi);
        iTurkMutfagi.yemekYap();




    }
}
