package com.sabal.chapter03.lesson04;

import com.sabal.chapter03.lesson03.MyFunctionalInterface;

public class LambdaUnderTheHood {

    public static void main(String[] args) {
        MyFunctionalInterface fun1 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation using anonymous class number 1");
            }
        };

        MyFunctionalInterface fun2 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation using anonymous class number 2");
            }
        };

        // invokeDynamic is applied, classes are not created for this
        MyFunctionalInterface fun3 = () -> System.out.println("Implementation using lambda number 1");
        MyFunctionalInterface fun4 = () -> System.out.println("Implementation using lambda number 2");
    }
}
