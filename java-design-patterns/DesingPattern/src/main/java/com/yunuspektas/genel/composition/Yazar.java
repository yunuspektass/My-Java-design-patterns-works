package com.yunuspektas.genel.composition;

import java.io.Serializable;
import java.util.List;

// 1 tane yazar
public class Yazar implements Serializable {
    private String  yazarAdi;
    //composition : has-a

private List<Kitap> kitapList;
    public Yazar(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    @Override
    public String toString() {
        return "Yazar : " + yazarAdi ;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }
}
