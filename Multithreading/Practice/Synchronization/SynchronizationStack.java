package com.Multithreading.Practice.Synchronization;

public class SynchronizationStack {
    private int[] array;
    private int stackTop;

    public SynchronizationStack(int cap){
        this.array = new int[cap];
        this.stackTop=0;
    }
    public boolean isEmpty(){
        return stackTop == 0;
    }
    public boolean isFull(){
        return stackTop == array.length;
    }
    public synchronized boolean add(int val){
        if(isFull()) return false;
        array[stackTop++] = val;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
    public synchronized boolean pop(){
        if(isEmpty()) return false;
        array[--stackTop]=0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
