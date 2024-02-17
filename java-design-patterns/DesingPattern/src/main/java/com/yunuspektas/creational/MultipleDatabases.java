package com.yunuspektas.creational;

//abstract
public abstract   class MultipleDatabases implements Cloneable  {
    private String username = "root";
    private  String password = "root";

    private String dbAnother = "jdbc";
    private String dbName ="mysql";


    private String localhost = "localhost";
    private String portNumber = "3306";
    private String schema ="design_pattern";
    private String url = dbAnother + ":" + dbName + "://" + localhost + ":" + portNumber + "/" + schema  ;

    @Override
 public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //toString
    @Override
    public String toString() {
        return "MultipleDatabases{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dbAnother='" + dbAnother + '\'' +
                ", dbName='" + getDbName() + '\'' +
                ", localhost='" + localhost + '\'' +
                ", portNumber='" + portNumber + '\'' +
                ", schema='" + schema + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    //    getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDbAnother() {
        return dbAnother;
    }

    public void setDbAnother(String dbAnother) {
        this.dbAnother = dbAnother;
    }

    public String getLocalhost() {
        return localhost;
    }

    public void setLocalhost(String localhost) {
        this.localhost = localhost;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
