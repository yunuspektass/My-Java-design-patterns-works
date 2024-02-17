package com.yunuspektas.structural.facade;

public class FacadeMainTest {
    public static void main(String[] args) {
        FacadeCreate  facadeCreate = new FacadeCreate();
        facadeCreate.getServlet().createTechnology();
        facadeCreate.getJsp().createTechnology();
        facadeCreate.getJsf().createTechnology();;
        facadeCreate.getSpring().createTechnology();;

    }
}
