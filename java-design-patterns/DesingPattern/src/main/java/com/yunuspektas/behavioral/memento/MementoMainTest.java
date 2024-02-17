package com.yunuspektas.behavioral.memento;

public class MementoMainTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setDurum("durum -1");
        originator.setDurum("durum -2");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("*****************************************");

        originator.setDurum("durum -3");
        originator.setDurum("durum -4");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("*****************************************");


        originator.setDurum("durum -5");
        System.out.println("Şimdiki durum : " + originator.getDurum());

        System.out.println("*****************************************");

        originator.getStateFromMemonto(careTaker.get(0));
        System.out.println("1. kaydı bana getir. "  + originator.getDurum());

        System.out.println("*****************************************");


    }
}
