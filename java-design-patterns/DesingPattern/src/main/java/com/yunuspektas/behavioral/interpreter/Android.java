package com.yunuspektas.behavioral.interpreter;

public class Android implements  ExpressionLanguage{
    @Override
    public void sonucMethod(Diller diller) {
        if (diller.simge.contains("A")){
            diller.toplamPara += 13;
        }
    }
}
