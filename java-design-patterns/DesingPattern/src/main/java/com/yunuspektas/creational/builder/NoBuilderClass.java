package com.yunuspektas.creational.builder;

import java.util.Date;

public class NoBuilderClass {
    private  String name;
    private String surname;
    private String country;
    private int age;
    private String emailAddres;
    private Date date;

// Parametresiz constructor
    public NoBuilderClass(){

    }
// Parametreli Constructor
    public NoBuilderClass(String name , int age) {
        this.name = name;
        this.age = age;

    }
    public NoBuilderClass(String surname){
        this.surname = surname;
    }

    public NoBuilderClass(String country, String emailAddres) {
        this.country = country;
        this.emailAddres = emailAddres;
    }

    public NoBuilderClass(String name, String surname, String country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public NoBuilderClass(String name, String surname, String country, int age) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
    }

    public NoBuilderClass(String name, String surname, String country, int age, String emailAddres) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.emailAddres = emailAddres;
    }

    public NoBuilderClass(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }





    public NoBuilderClass(String name, String surname, String country, int age, String emailAddres, Date date) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.emailAddres = emailAddres;
        this.date = date;
    }
//    getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "BuilderClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", emailAddres='" + emailAddres + '\'' +
                ", date=" + date +
                '}';
}

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
