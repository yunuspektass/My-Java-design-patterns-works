package com.yunuspektas.behavioral.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Mediator {

    public static void mesajGoster(Student student , String mesaj){
        Locale locale = new Locale("tr" , "TR");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss" , locale);



        Date tarih = new Date();

        String format = dateFormat.format(tarih);

        System.out.println(tarih.toString() + " " + student.getStudentName() + mesaj);
        System.out.println(format + " " + student.getStudentName() + mesaj);
    }
}
