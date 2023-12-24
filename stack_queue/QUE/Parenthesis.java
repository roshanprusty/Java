package com.stack_queue.QUE;

import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) {
        String brackets = "[()]{}{[()()]()}";
        parenthesis(brackets);
    }
    public static void parenthesis(String brackets) {
        char[] arr = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
                stack.push(arr[i]);
            } else if (!stack.isEmpty() && isMatching(stack.peek(), arr[i])) {
                stack.pop();
            } else {
                System.out.println("Not balanced");
                return;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
