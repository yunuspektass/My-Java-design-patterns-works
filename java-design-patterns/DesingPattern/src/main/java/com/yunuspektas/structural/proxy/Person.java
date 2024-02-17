package com.yunuspektas.structural.proxy;

public class Person {
    private String userEmail;
    private String userPassword;
    private boolean isSuperAdmin;

    public Person(String userEmail, String userPassword, boolean isSuperAdmin) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.isSuperAdmin = isSuperAdmin;
    }

// getter and setter
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }
}
