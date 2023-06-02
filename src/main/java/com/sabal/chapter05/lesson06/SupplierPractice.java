package com.sabal.chapter05.lesson06;

import java.sql.Timestamp;
import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> String.valueOf(new Timestamp(System.currentTimeMillis()));
        System.out.println(supplier.get());

        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());
    }
}
