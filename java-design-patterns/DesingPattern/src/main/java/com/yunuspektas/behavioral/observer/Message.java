package com.yunuspektas.behavioral.observer;

public class Message implements  IObserver{

    private  ITrigger trigger;

    public Message(){

    }

    public Message(ITrigger trigger) {
        this.trigger = trigger;
    }

    @Override
    public void pushNotification(String cumle) {
        System.out.println("Mesajımız : " + cumle);
    }


public void deleteTrigger(){
    trigger.removeTrigger(this);
}

    public ITrigger getTrigger() {
        return trigger;
    }

    public void setTrigger(ITrigger trigger) {
        this.trigger = trigger;
    }
}