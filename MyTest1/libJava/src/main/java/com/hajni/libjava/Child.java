package com.hajni.libjava;

public class Child extends Parent {

    public String hobby;

    Child(){
        System.out.println("Child class");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("hobby : " + hobby);
    }
}
//    void printChildInfo(){
//        System.out.println("name : " + name);
//        System.out.println("age : " + age);
//        System.out.println("job : " + job);
//        System.out.println("hobby : " + hobby);
//    }