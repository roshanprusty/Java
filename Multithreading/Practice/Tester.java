package com.Multithreading.Practice;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1(), "thread1");
        Thread t2 = new Thread2("thread2");

        t1.start();
        t2.start();
    }
}
