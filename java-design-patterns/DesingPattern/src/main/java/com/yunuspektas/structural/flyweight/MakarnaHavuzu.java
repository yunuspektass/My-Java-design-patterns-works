package com.yunuspektas.structural.flyweight;

import java.util.Dictionary;
import java.util.Hashtable;


public class MakarnaHavuzu {
    private Dictionary<MakarnaCinsi , Makarna> makarnaList;

//parametresiz constructor
public MakarnaHavuzu(){
    makarnaList = new Hashtable<MakarnaCinsi , Makarna>();
}

//method
public Makarna getMakarna(MakarnaCinsi makarnaCinsi){
    if (makarnaList.get(makarnaCinsi) != null)
    {
        return  makarnaList.get(makarnaCinsi);
    }
    Makarna makarna = null;
    
    if (makarnaCinsi == MakarnaCinsi.fiyonk)
    {
        makarna = new FiyonkMakarna(25,5);
    }
    else if (makarnaCinsi == MakarnaCinsi.kelebek)
    {
        makarna = new KelebekMakarna(50,8);
    }
    makarnaList.put(makarnaCinsi , makarna);

    return makarna;
}

}
