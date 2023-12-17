package com.Multithreading.Practice;

public class Thread2 extends Thread{
    public Thread2(String name){
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi Everyone! "+Thread.currentThread());
        }
    }

}
