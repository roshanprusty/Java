package com.stack_queue.QUE;

import java.util.Stack;

public class ReversingTheStack7 {
    // Reverse the stack using recursion
//    https://www.youtube.com/watch?v=fEauTlo6J-w
//    https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
    public static void reversingTheStack(Stack<Integer> stack) {
        if (stack.size() > 0) {
            int temp = stack.peek();
            stack.pop();
            reversingTheStack(stack);
            insert_at_bottom(stack, temp);
        }
    }

    static void insert_at_bottom(Stack<Integer> st, int x) {
        if (st.isEmpty())
            st.push(x);
        else {
            int a = st.peek();
            st.pop();
            insert_at_bottom(st, x);
            st.push(a);
        }
    }

    static void printStack(Stack<Integer> stack) {
        for (int val : stack) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.print("Before: ");
        printStack(stack);
        reversingTheStack(stack);
        System.out.print("After: ");
        printStack(stack);
    }
}
