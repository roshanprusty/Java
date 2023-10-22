package com.stack_queue.QUE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class DeleteConsecutive {
    public static int deleteConsecutive(String input){
        String[] array = input.split(" ");
        Stack<String> stack=new Stack<>();
        for(String i: array){
            if (!stack.isEmpty()) {
                String temp = stack.peek();
                if (temp.equals(i)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(i);
        }
        return stack.size();
    }
    public static void main(String[] args) {
        String input="ab aa aa bcd ab";
        System.out.println(deleteConsecutive(input));
    }
}
