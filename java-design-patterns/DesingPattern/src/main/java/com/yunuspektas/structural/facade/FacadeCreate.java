package com.yunuspektas.structural.facade;

public class FacadeCreate {

//Sınıfları Çağır
    private Servlet servlet;
    private  Jsf jsf;
    private  Jsp jsp;
    private Spring spring;

// Parametresiz constructor
    public  FacadeCreate(){
    servlet = new Servlet();
    jsf = new Jsf();
    jsp = new Jsp();
    spring = new Spring();

    }
//    getter and setter


    public Servlet getServlet() {
        return servlet;
    }

    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }

    public Jsf getJsf() {
        return jsf;
    }

    public void setJsf(Jsf jsf) {
        this.jsf = jsf;
    }

    public Jsp getJsp() {
        return jsp;
    }

    public void setJsp(Jsp jsp) {
        this.jsp = jsp;
    }

    public Spring getSpring() {
        return spring;
    }

    public void setSpring(Spring spring) {
        this.spring = spring;
    }
}
