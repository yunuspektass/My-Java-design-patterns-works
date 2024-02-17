package com.yunuspektas.behavioral.strategy;

public class Mektup implements IIletisim{
    @Override
    public void send() {
        System.out.println("Mektup ile gönderildi.");
    }
}
