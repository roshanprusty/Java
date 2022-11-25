package com.stack_queue;

import java.util.Stack;

public class S {
    public static void main(String[] args) {
        //stack
        Stack<Integer> stack=new Stack<>();
        stack.push(24);
        stack.push(4);
        stack.push(96);
        stack.push(55);
        stack.push(11);

//        first in last out
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
