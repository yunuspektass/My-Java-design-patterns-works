package com.yunuspektas.creational.object.pool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPoolDesign {


    //Class object
    //singleton design pattern
    protected static ObjectPoolDesign objectPoolDesign;
//  protected aynı sınıf ve alt sınıf(sub) çalışır.
    private final static short MaxPoolSize = 15;
    private static List<UsesObjectDesign> usesObjectlist;

//singleton design pattern
//parametresiz constructor
    protected  ObjectPoolDesign(){
        usesObjectlist = new ArrayList<UsesObjectDesign>();
    }

//singleton design pattern
    public static ObjectPoolDesign getObjectPoolDesign(){
        if (objectPoolDesign==null){
            objectPoolDesign = new ObjectPoolDesign();
            for (int i = 0 ; i < MaxPoolSize ; i++){
                UsesObjectDesign list = new UsesObjectDesign();
            usesObjectlist.add(list);
            }
        }
        return objectPoolDesign;
    }

// false dizileri
    public  UsesObjectDesign getUsesObjectDesign(){
        for (UsesObjectDesign temp : usesObjectlist){
            if (!temp.isActive()){
                return temp;
            }
        }
        return null;
    }
//kullanmadığımız nesneleri iade etmeliyi<
    public void  lendItBack (UsesObjectDesign usesObjectDesign){
        usesObjectDesign.setActive(false);

    }

}
