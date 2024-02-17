package com.yunuspektas.structural.flyweight;

abstract public class Makarna {
    public   MakarnaCinsi makarnaCinsi;
    public double makarnaUzunugu;
    public double makarnaFiyati;

    abstract  public void makarnaUret(String unMiktari , String yagMiktari , int yumurtaSayisi);

}
