package com.yunuspektas.behavioral.strategy;

public class Strategy {
    private IIletisim iletisim;


    public IIletisim getIletisim() {
        return iletisim;
    }

    public void setIletisim(IIletisim iletisim) {
        this.iletisim = iletisim;
    }
//    gönderme metodu
    public void gondermeBilgisi(){
        iletisim.send();
    }
}
