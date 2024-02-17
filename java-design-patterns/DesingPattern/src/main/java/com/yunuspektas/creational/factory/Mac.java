package com.yunuspektas.creational.factory;

public class Mac implements IBilgisayar {
    @Override
    public String getComputerName() {

        return "MaC";
    }

    @Override
    public String toString() {
        return "Mac{}";
    }
}
