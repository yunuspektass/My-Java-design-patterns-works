package com.yunuspektas.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;


public class Interpreter {
    public List<ExpressionLanguage> expressionLanguagesList (String simge){
        List<ExpressionLanguage> listem = new ArrayList<ExpressionLanguage>();

        for(char temp : simge.toCharArray()){
            switch (temp) {
                case 'J':
                    listem.add(new Java());
                    break;

                case 'A':
                    listem.add(new Android());
                    break;

                case 'P':
                    listem.add(new Python());
                    break;

                default:
                    System.out.println("Doğru simgeyi seçiniz");
                    break;
            }
        }
        return listem;
    }

    public void genel(Diller diller){
        for (ExpressionLanguage temp : expressionLanguagesList(diller.simge)){
            temp.sonucMethod(diller);
        }
    }
}
