package com.sabal.chapter03.lesson03;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        MyFunctionalInterface inter = () -> System.out.println("Functional Interfaces Demo");
        inter.myMethod();

        onTheFly(inter);
    }

    public static void onTheFly(MyFunctionalInterface fun) {
        fun.myMethod();
    }
}
