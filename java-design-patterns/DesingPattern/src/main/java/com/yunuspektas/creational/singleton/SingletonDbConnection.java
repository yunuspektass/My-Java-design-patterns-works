package com.yunuspektas.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDbConnection {
    //1-constructor: private olmalıdır
    private  SingletonDbConnection (){

    }
    //2-değişken: private,static ve class türünde olmalıdır.

    private static SingletonDbConnection instance;

    // 3-) method: public,static ve class türünde olmalıdır.
public static SingletonDbConnection getInstance(){
  if (instance == null){
      instance = new SingletonDbConnection();
  }
return  instance;
}
///////////////////////DATABASE//////////////////////////////

    public static SingletonDbConnection getInstance2(){
        if (instance == null){
        synchronized (SingletonDbConnection.class){
            instance = new SingletonDbConnection();
        }
        }
        return  instance;
    }
    public Connection  getConnection(){
    Connection connection = null;
    try {
 Class.forName("com.mysql.jdbc.Driver");
 String url ="" ,  user="" , password="";
connection = DriverManager.getConnection(url,user,password);
    }
    catch (SQLException sqlException){
    }
    catch (ClassNotFoundException cnot){
    }
    return null;
    }
}
