package com.yunuspektas.behavioral.memento;

public class Originator {
//    nesne değişkeni
    private  String durum;

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
    public Memento saveStateToMemento(){
        return  new Memento(durum);
    }
    public void getStateFromMemonto(Memento memento){
        durum = memento.getDurum();
    }

}
