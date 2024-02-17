package com.yunuspektas.genel.accessmodifier;

public class Access {
    protected String isimSoyisim;
    private String memleket;

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public void genelMethodd(){
        System.out.println(isimSoyisim);
    }


}
