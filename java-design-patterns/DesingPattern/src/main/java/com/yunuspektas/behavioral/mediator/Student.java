package com.yunuspektas.behavioral.mediator;

public class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void mesajGonder(String mesaj){
Mediator.mesajGoster(this , mesaj);
    }
}
