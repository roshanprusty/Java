package com.Multithreading.Practice.Synchronization;

public class Stack {
    private int[] array;
    private int stackTop;

    public Stack(int cap){
       this.array = new int[cap];
       this.stackTop=0;
    }
    public boolean isEmpty(){
        return array.length==0;
    }
    public boolean isFull(){
        return array.length==stackTop;
    }
    public boolean add(int val){
        if(isFull()) return false;
        array[stackTop++]=val;
        return true;
    }
    public boolean pop(){
        if(isEmpty()) return false;
        array[stackTop--]=Integer.MIN_VALUE;
        return true;
    }
}
