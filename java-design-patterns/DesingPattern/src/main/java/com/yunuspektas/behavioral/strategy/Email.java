package com.yunuspektas.behavioral.strategy;

public class Email implements IIletisim{
    @Override
    public void send() {
        System.out.println("Email ile gönderildi");
    }
}
