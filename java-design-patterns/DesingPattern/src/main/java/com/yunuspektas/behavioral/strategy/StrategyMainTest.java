package com.yunuspektas.behavioral.strategy;

public class StrategyMainTest {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();

        strategy.setIletisim(new Email());
        strategy.gondermeBilgisi();
        System.out.println("*************************************");

        strategy.setIletisim(new Sms());
        strategy.gondermeBilgisi();
        System.out.println("*************************************");

        strategy.setIletisim(new Mektup());
        strategy.gondermeBilgisi();
        System.out.println("*************************************");



    }
}
