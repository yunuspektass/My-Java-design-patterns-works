package com.yunuspektas.behavioral.template;

abstract public class Okul {
    abstract void ortaOkul();
    abstract void lise();
    abstract void universite();

//     template method
    public final void mezun(){
        ortaOkul();
        lise();
        universite();
    }
}
