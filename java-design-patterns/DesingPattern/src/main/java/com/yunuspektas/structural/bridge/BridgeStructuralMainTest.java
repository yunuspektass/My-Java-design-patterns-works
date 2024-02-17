package com.yunuspektas.structural.bridge;

public class BridgeStructuralMainTest {
    public static void main(String[] args) {
        Yazilimci fro = new Html5( new FrondEnd() , "Yunus" );
        fro.kodlama();

        System.out.println("***********************************");

        Yazilimci back = new Java( new BackEnd() , "Yunus" );
        back.kodlama();
    }
}
