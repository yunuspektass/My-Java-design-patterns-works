package com.yunuspektas.behavioral.iterator;

public class IteratorMainTest {
    public static void main(String[] args) {
         ControlRoom controlRoom = new ControlRoom();

         for (IIterator iIterator = controlRoom.getIterator() ; iIterator.hasNext() ;){
             String result =(String) iIterator.next();
             System.out.println("Sonuç : " + result);
         }
    }
}
