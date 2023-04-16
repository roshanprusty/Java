package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Check {
    public static void main(String[] args) {
        int[] push={1,2,3,4,5};
        int[] pop={4,3,5,1,2};
        System.out.println(validateStackSequences(push,pop));


    }
    static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int countPop =0;
        int countPush =1;
        int popLen = popped.length;
        stack.push(pushed[0]);
        while(countPop!=popLen-1){
            if(stack.peek()==popped[countPop]){
                stack.pop();
                countPop++;
                continue;
            }
            if(countPush<popLen){
                stack.push(pushed[countPush]);
                countPush++;
            }else if(countPush<=popLen && stack.peek()!=popped[countPop]) return false;
            if(stack.empty()) return true;

        }
        return true;
    }
}
