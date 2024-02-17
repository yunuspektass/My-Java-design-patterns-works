package com.yunuspektas.creational.prototype;

import com.yunuspektas.creational.MultipleDatabases;

public class PrototypeMainTest {
    public static void main(String[] args) {
//  MultipleDatabases multipleDatabases = new MultipleDatabases();
//        System.out.println(multipleDatabases.getUrl());
//        System.out.println(multipleDatabases.getDbName());

        MultipleDatabases mysql = new Mysql();
        System.out.println(mysql.hashCode());
        System.out.println(mysql.toString());
        System.out.println("**************************************");
// Asıl olayın gerçekleştiği yer
        try {
            MultipleDatabases mssql =(MultipleDatabases) mysql.clone();
            mssql.setDbName("mssql");
            System.out.println(mssql.hashCode());
            System.out.println(mssql.toString());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
