package com.yunuspektas.creational.object.pool;

public class UsesObjectDesign {
// field
    private boolean isActive;
//    parametresiz constructor
    public UsesObjectDesign(){
        this.isActive=false;
    }
//getter and setter
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
