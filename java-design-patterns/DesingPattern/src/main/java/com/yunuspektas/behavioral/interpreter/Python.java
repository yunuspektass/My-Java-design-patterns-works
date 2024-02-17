package com.yunuspektas.behavioral.interpreter;

public class Python implements  ExpressionLanguage{
    @Override
    public void sonucMethod(Diller diller) {
        if (diller.simge.contains("P")){
            diller.toplamPara += 11;
        }
    }
}
