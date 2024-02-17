package com.yunuspektas.structural.decorator;

 abstract  public class DecoratorKeman implements IKeman{

//     interface çağırmak
     protected IKeman iKeman;

     public DecoratorKeman(IKeman iKeman) {
         this.iKeman = iKeman;
     }

     @Override
     public String kemanYap() {
         return iKeman.kemanYap();
     }
 }
