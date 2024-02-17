package com.yunuspektas.creational.object.pool;

public class ObjectPoolDesignMainTest {
    public static void main(String[] args) {
        UsesObjectDesign usesObjectDesign = ObjectPoolDesign.getObjectPoolDesign().getUsesObjectDesign();

// Kodlarımıza işlemler yapıyoruz
//.....
//İşlemimiz bitti havuza iade ediyorum

        ObjectPoolDesign.getObjectPoolDesign().lendItBack(usesObjectDesign);

    }
}
