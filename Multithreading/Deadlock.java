package com.Multithreading;

public class Deadlock {
    public static void main(String[] args) {
        String lock1 ="roshan";
        String lock2 ="prusty";
        System.out.println("main is starting");
        Thread thread1 = new Thread(() -> {
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
