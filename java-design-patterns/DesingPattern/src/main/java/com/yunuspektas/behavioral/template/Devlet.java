package com.yunuspektas.behavioral.template;

public class Devlet extends Okul{
    @Override
    void ortaOkul() {
        System.out.println("Devlet sektör ortaokula gidildi");
    }
    @Override
    void lise() {
        System.out.println("Devlet sektör liseye gidildi");

    }
    @Override
    void universite() {
        System.out.println("Devlet sektör universiteye gidildi");

    }
}
