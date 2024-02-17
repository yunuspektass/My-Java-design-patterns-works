package com.yunuspektas.structural.adapter;

public class HintMutfagiAdapter implements ITurkMutfagi{
    private  HintMutfagi hintMutfagi;

    public HintMutfagiAdapter(HintMutfagi hintMutfagi) {
        this.hintMutfagi = hintMutfagi;
    }

    @Override
    public void yemekYap() {
        System.out.println("Adapter... Hint mutfağı");
    }
}
