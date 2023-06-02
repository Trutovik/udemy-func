package com.sabal.chapter06.lesson02;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {
        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get());

        System.out.println("--------------------------------------------------");
        doubleSupplier = Math::random;
        System.out.println(doubleSupplier.get());
    }
}
