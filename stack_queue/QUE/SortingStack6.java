package com.stack_queue.QUE;

import java.util.Stack;

public class SortingStack6 {
    public static void sortingStack(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            int val=stack.pop();
            while (!temp.isEmpty() && val>temp.peek()){
                stack.push(temp.pop());
            }
            temp.push(val); // 23 92
        }
        System.out.println(temp.toString());
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        System.out.println(stack.peek());
        sortingStack(stack);

    }
}
