package com.sabal.chapter05.lesson03;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T t);
}
