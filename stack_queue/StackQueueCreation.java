package com.stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackQueueCreation {
    public static void queueCreation(Stack<Integer> stack){
        //3 - 2 - 1
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
//    public static void stackCreation(Queue<Integer> que){
//        Queue<Integer> que2 = new ArrayDeque<>();
//        while (!que.isEmpty()){
//            que2
//        }
//    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        queueCreation(stack);
    }
}
