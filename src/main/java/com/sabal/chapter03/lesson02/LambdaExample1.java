package com.sabal.chapter03.lesson02;

public class LambdaExample1 {

    public static void main(String[] args) {
        // This is the most straighforward way. Creating runnable
        MyRunnable runnable = new MyRunnable();
        Thread oldWayThread = new Thread(runnable);
        oldWayThread.start();

        // This is how it may be executed using anonymous classes
        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous thread executed");
            }
        });
        anonymousThread.start();

        // Lambda way
        new Thread(() -> System.out.println("Lambda thread executed")).start();
    }
}
