package com.Rec2;

import java.util.Scanner;

public class Lc1342 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println( numberOfSteps(num));
    }

//    static int numberOfSteps(int num) {
//        int count=0;
//        while (num>0) {
//            if (num % 2 == 0) {
//                num /= 2;
//                count++;
//            } else {
//                num--;
//                count++;
//            }
//        }
//        return count;
//    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}


