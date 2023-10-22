package com.stack_queue.QUE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoStackArray {
    int size;
    int[] arr;
    int top1, top2;

    public TwoStackArray(int size) {
        this.size = size;
        arr=new int[size];
        top1=0;
        top2=size-1;
    }
    public void push1(int val){
       if(top1<=top2){
           arr[top1]=val;
           top1++;
       }
       else{
           System.out.println("Overflow "+val);
       }
    }
    public void push2(int val){
        if(top2>top1){
            arr[top2]=val;
            top2--;
        }else {
            System.out.println("Overflow "+val);
        }
    }
    public void pop1(){
        if(top1>0){
            top1--;
            arr[top1]=0;
        }
        else System.out.println("stack is empty");
    }
    public void pop2(){
        if(top2<size-1){
            top2++;
            arr[top2]=0;
        }
        else System.out.println("stack is empty");
    }
    public static void main(String[] args) {
        TwoStackArray twoStackArray = new TwoStackArray(10);
        twoStackArray.push1(1);
        twoStackArray.push2(-1);
        twoStackArray.push2(-2);
        twoStackArray.push2(-3);
        twoStackArray.push2(-4);
        twoStackArray.push2(-5);
        twoStackArray.push2(-6);
        twoStackArray.push2(-7);
        twoStackArray.push2(-8);
        twoStackArray.pop1();
        twoStackArray.pop1();
        twoStackArray.pop2();
        twoStackArray.pop2();
//        twoStackArray.pop1();


        System.out.println(Arrays.toString(twoStackArray.arr));

    }
}
