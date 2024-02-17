package com.yunuspektas.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PushNotification implements  ITrigger{
    private List<IObserver> observerList = new ArrayList<IObserver>();
    private String mesaj = " Mesaj : Push notification";
    @Override
    public void addTrigger(IObserver iObserver) {
observerList.add(iObserver);
    }

    @Override
    public void removeTrigger(IObserver iObserver) {
observerList.remove(iObserver);
    }

    @Override
    public void messageShow() {
for (IObserver temp : observerList){
    temp.pushNotification(mesaj);
}
    }
}
