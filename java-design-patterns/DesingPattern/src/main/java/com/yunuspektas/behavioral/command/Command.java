package com.yunuspektas.behavioral.command;

public class Command {
    public static String result(LoglamaOrnegi loglamaOrnegi , String ulke , String sehir){
        return loglamaOrnegi.loglamaTuru(ulke,sehir);
    }
}
