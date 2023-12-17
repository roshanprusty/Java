package com.Multithreading.Practice.Synchronization;

public class Tester {
    public static void main(String[] args) {
//        Stack stack = new Stack(5);
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread()+" "+stack.add(i));
//            }
//        }, "add");
//        Thread t2 = new Thread(()->{
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread()+" "+stack.pop());
//            }
//        }, "pop");
//
//        t1.start();
//        t2.start();

        SynchronizationStack syncstack = new SynchronizationStack(5);
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread()+" "+syncstack.add(i));
            }
        }, "add");
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread()+" "+syncstack.pop());
            }
        }, "pop");

        t1.start();
        t2.start();
    }
    //SIMPLE AND DIRECT FORWARD RULE OF SYNCHRONIZATION: Wait until the ongoing thread work is not over. When ongoing thread work gets over, it will redirect to another thread.

}
