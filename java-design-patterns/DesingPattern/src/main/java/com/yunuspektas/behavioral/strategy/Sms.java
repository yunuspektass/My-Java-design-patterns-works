package com.yunuspektas.behavioral.strategy;

public class Sms implements IIletisim{
    @Override
    public void send() {
        System.out.println("Sms ile gönderildi.");
    }
}
