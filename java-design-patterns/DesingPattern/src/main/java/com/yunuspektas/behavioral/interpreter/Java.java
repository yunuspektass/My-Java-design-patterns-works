package com.yunuspektas.behavioral.interpreter;

public class Java implements  ExpressionLanguage{
    @Override
    public void sonucMethod(Diller diller) {
        if (diller.simge.contains("J")){
            diller.toplamPara += 15;
        }
    }
}
