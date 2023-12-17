package com.Multithreading.Practice;

public class Thread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi Everyone! "+Thread.currentThread());
        }
    }
}
