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

        //first in last out
        //24-4-96-55-11
        //11-55-96-4-24

        System.out.println(stack.empty());

        System.out.println(stack.search(55));

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
