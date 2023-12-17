package com.Multithreading;

public class ThreadTester {
    public static void main(String[] args) {

//        System.out.println("main is starting");
//
//        //Type 1 to create
//        Thread T1 = new Thread1();
//        T1.start();
//
//        //Type 2 to create
//        Thread T2 = new Thread(() ->
//        {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("I am from thread2 and here is my count: "+ i);
//            }
//        }, "thread2");
//        T2.start();
//
//        System.out.println("main is exiting");

//        Stack stack = new Stack(5);
//        Thread t1 = new Thread(()->{
//            int counter =0;
//            while (++counter<10) System.out.println("Pushed: "+ stack.push(100));
//        }, "Pusher");
//        t1.start();
//
//        new Thread(()->{
//            int counter=0;
//            while (++counter<10){
//                System.out.println("Popped: "+ stack.pop());
//            }
//        }, "Popper").start();

        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread());
        }," Our Thread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main is existing");
    }
}
//    main is starting
//        main is exiting
//        I am from 0
//        I am from 1
//        I am from 2
//        I am from 3
//        I am from 4

//Although it is showing orderly; here you cannot predict, at what sequence it will show the result. It depends on machine to machine.
//Behind the Scene
//Actually what the happening is When thread is executing it sees if something is taking time. It will not wait to get the result, It will
//just redirect to another thing
