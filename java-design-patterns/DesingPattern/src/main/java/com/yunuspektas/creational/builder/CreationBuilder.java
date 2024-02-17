package com.yunuspektas.creational.builder;

import java.util.Date;

public class CreationBuilder {
//  Builder: 1. adım toString oluşturmak
// Builder: 2. adım innerClass , iç içe sınıflar
    private  String name;
    private String surname;
    private String country;
    private int age;
    private String emailAddres;
    private Date date;

    // Parametresiz constructor
    public CreationBuilder(){

    }
//    parametreli innerClass constructor
    public CreationBuilder(Builder builder){
   this.name = builder.name;
   this.surname = builder.surname;
   this.country = builder.country;
   this.age = builder.age;
   this.emailAddres = builder.emailAddres;
   this.date = builder.date;




    }

//toString
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

    ///////////////////////////////////////

//    2. ADIM innerclass
//    Normalde 1 tane public class vardır , static class yoktur(inner classlar hariç)
    public static class Builder{
    private  String name;
    private String surname;
    private String country;
    private int age;
    private String emailAddres;
    private Date date;

//    parametresiz constructor
    public Builder(){

    }

//    parametreli metodlar
    public Builder  name (String name) {
        this.name = name;
        return this;
    }
    public Builder surname (String surname) {
        this.surname = surname;
        return this;
    }
    public Builder country (String country) {
        this.country = country;
        return this;
    }
    public Builder age (int age) {
        this.age = age;
        return this;
    }
    public Builder  emailAddres (String emailAddres) {
        this.emailAddres = emailAddres;
        return  this;
    }
    public Builder date (Date date) {
        this.date = date;
        return this;
    }
//    CreationBuilder
    public CreationBuilder build(){
        return new CreationBuilder(this);
    }

}
}
