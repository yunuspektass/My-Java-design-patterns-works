package com.yunuspektas.creational.builder;

public class BuilderMainTest {
    public static void main(String[] args) {
//        builder yoksa
        NoBuilderClass noBuilderClass = new NoBuilderClass("yunus");
        System.out.println(noBuilderClass);
        System.out.println("-------------------------------");
//        creationBuilder
        CreationBuilder builder = new CreationBuilder.Builder().surname("Yunus").age(21).build();
        System.out.println(builder);

//   lombokBuilder
//   LombokBuilder lombokBuilder = new LombokBuilder.LombokBuilderBuilder().surname("Yunus").age(21).build();
//   System.out.println(lombokBuilder);



    }
}
