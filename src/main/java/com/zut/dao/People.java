package com.zut.dao;

@Demo1(name="xxp",age=20)
public class People {

    public static void main(String[] args) {
        Class<People> peopleClass = People.class;

        Demo1 annotation = peopleClass.getAnnotation(Demo1.class);

        System.out.println(annotation.age());
        System.out.println(annotation.name());


    }





}
