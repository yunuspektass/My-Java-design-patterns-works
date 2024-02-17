package com.yunuspektas.structural.decorator;

public class DecoratorMainTest {
    public static void main(String[] args) {
IKeman iKeman = new Akustik(new Ayaklık(new KemanOzelliklerii(4,4) , " ayaklık eklendi "  ) ," akustik ses eklendi " );
String result = iKeman.kemanYap();
        System.out.println(result);
    }
}
