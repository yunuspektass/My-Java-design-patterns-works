package com.yunuspektas.structural.composite;

import java.util.ArrayList;
import java.util.List;

//composite : en tepedeki yer
public class UstaBirligi implements IAsker {
    private String ustaBirligiAdi;
    private List<IAsker> iAskerList;

//   parametreli constructor
    public UstaBirligi(String ustaBirligiAdi) {
        this.ustaBirligiAdi = ustaBirligiAdi;
        iAskerList = new ArrayList<IAsker>();
    }

//    interface parametresi
    public void ekle(IAsker iAsker){
        iAskerList.add(iAsker);
    }

    @Override
    public void askerAdimAt() {
        System.out.println(ustaBirligiAdi);

        for ( IAsker temp : iAskerList){
            temp.askerAdimAt();
            System.out.println("**********************");
        }
    }
}
