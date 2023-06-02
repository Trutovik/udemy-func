package com.sabal.chapter06.lesson02;

import java.util.function.BiFunction;

public class StaticReference {

    public static void main(String[] args) {
        BiFunction<String, String, String> biFunctionLambda = (a, b) -> A_Class.staticMethod(a, b);
        System.out.println(biFunctionLambda.apply("Alex", "Sabalevich"));
        System.out.println("----------------------------------------------------------");
        BiFunction<String, String, String> biFunctionReference = A_Class::staticMethod;
        System.out.println(biFunctionReference.apply("Ivan", "Sabalevich"));
    }
}
